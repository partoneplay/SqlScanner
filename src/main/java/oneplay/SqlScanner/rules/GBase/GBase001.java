package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.antlr.NodeName;
import oneplay.SqlScanner.rules.RuleResult;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GBase001 extends BaseRule {
    private static Logger logger = LogManager.getLogger(GBase001.class);

    @Override
    public List<RuleResult> match(ParseTree parseTree) {
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        Rule001Listener rule001Listener = new Rule001Listener();
        parseTreeWalker.walk(rule001Listener, parseTree);
        return rule001Listener.getRuleResultList();
    }

    /**
     * 算法描述：多表关联查询，查询列不能包含聚合函数
     * 1. 多表查询包括表和子查询，子查询算作一个表
     * 2. 遍历语法树，QuerySpecification作为一个判断单元，子查询递归处理
     * 3. 遍历过程为先select子句后from子句
     */
    private class Rule001Listener extends GBaseParserBaseListener {
        private Stack<NodeName> sqlStructure = new Stack<>();
        private List<RuleResult> ruleResultList = new ArrayList<>();

        List<RuleResult> getRuleResultList() {
            return ruleResultList;
        }

        @Override
        public void enterDmlStatement(GBaseParser.DmlStatementContext ctx) {
            logger.debug(getIndentString("DmlStatement begin ..."));
        }

        @Override
        public void exitDmlStatement(GBaseParser.DmlStatementContext ctx) {
            logger.debug(getIndentString("DmlStatement end\n"));
        }

        @Override
        public void enterQuerySpecification(GBaseParser.QuerySpecificationContext ctx) {
            enterSelect();
        }

        @Override
        public void exitQuerySpecification(GBaseParser.QuerySpecificationContext ctx) {
            exitSelect(ctx.start, ctx.stop);
        }

        @Override
        public void enterQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx) {
            enterSelect();
        }

        @Override
        public void exitQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx) {
            exitSelect(ctx.start, ctx.stop);
        }

        private void enterSelect() {
            logger.debug(getIndentString("QuerySpecification enter"));
            sqlStructure.push(NodeName.querySpecification); // 递归分隔
            indent();
        }

        private void exitSelect(Token start, Token stop) {
            boolean containersAggFunc = false; // 是否包含聚合函数
            int tableCount = 0; // 源表个数（包括子查询）

            // 解析结构
            NodeName nodeName = sqlStructure.pop();
            while (nodeName != NodeName.querySpecification) { // 递归分隔
                switch (nodeName) {
                    case aggregateWindowedFunction:
                        containersAggFunc = true;
                        break;
                    case tableSourceItem:
                        tableCount += 1;
                        break;
                }
                nodeName = sqlStructure.pop();
            }
            if (containersAggFunc && tableCount > 1) {
                RuleResult ruleResult = new RuleResult(start, stop, "bad aggregate function after join");
                ruleResultList.add(ruleResult);
                logger.debug(getIndentString(ruleResult.toString()));
            }

            unindent();
            logger.debug(getIndentString("QuerySpecification exit"));
        }


        /* 聚合函数入栈 */
        @Override
        public void enterAggregateWindowedFunction(GBaseParser.AggregateWindowedFunctionContext ctx) {
            logger.debug(getIndentString("Found AggregateWindowedFunction " + ctx.getText()));
            sqlStructure.push(NodeName.aggregateWindowedFunction);
        }


        /* 源表入栈 */
        @Override
        public void enterAtomTableItem(GBaseParser.AtomTableItemContext ctx) {
            logger.debug(getIndentString("Found AtomTableItem " + ctx.tableName().getText()));
            sqlStructure.push(NodeName.tableSourceItem);
        }

        @Override
        public void enterSubqueryTableItem(GBaseParser.SubqueryTableItemContext ctx) {
            logger.debug(getIndentString("Found SubqueryTableItem"));
            sqlStructure.push(NodeName.tableSourceItem);
        }
    }

}


