package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.NodeName;
import oneplay.SqlScanner.rules.RuleResult;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GBase003 extends BaseRule {
    private static Logger logger = LogManager.getLogger(GBase002.class);

    @Override
    public List<RuleResult> match(ParseTree parseTree) {
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        GBase003.Rule003Listener rule002Listener = new GBase003.Rule003Listener();
        parseTreeWalker.walk(rule002Listener, parseTree);
        return rule002Listener.getRuleResultList();
    }

    /**
     * 算法描述：关联查询必须存在筛选条件，且join子句不能包含非关联条件
     * 1. 前置判断条件为多表关联查询
     * 2. 缺少where子句或者join子句包含非关联条件
     * 3. 对每个QuerySpecification进行递归判断
     */
    private class Rule003Listener extends GBaseParserBaseListener {
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

        /* 子查询 */
        @Override
        public void enterQuerySpecification(GBaseParser.QuerySpecificationContext ctx) {
            enterSelect();
        }

        @Override
        public void exitQuerySpecification(GBaseParser.QuerySpecificationContext ctx) {
            exitSelect();
        }

        @Override
        public void enterQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx) {
            enterSelect();
        }

        @Override
        public void exitQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx) {
            exitSelect();
        }

        private void enterSelect() {
            logger.debug(getIndentString("QuerySpecification enter"));
            sqlStructure.push(NodeName.querySpecification);
            indent();
        }

        private void exitSelect() {
            if (sqlStructure.peek() == NodeName.querySpecification) {
                sqlStructure.pop();
            }
            unindent();
            logger.debug(getIndentString("QuerySpecification exit"));
        }

        /* 在where子句中进行结构判断 */
        @Override
        public void enterFromClause(GBaseParser.FromClauseContext ctx) {
            logger.debug(getIndentString("QuerySpecification enter"));
            sqlStructure.push(NodeName.querySpecification); // 递归分隔
            indent();
        }

        @Override
        public void exitFromClause(GBaseParser.FromClauseContext ctx) {
            int tableCount = 0; // 源表个数

            // 解析结构
            NodeName nodeName = sqlStructure.pop();
            while (nodeName != NodeName.querySpecification) { // 递归分隔
                if (nodeName == NodeName.tableSourceItem) {
                    tableCount += 1;
                }
                nodeName = sqlStructure.pop();
            }
            if (tableCount > 1 && ctx.whereExpr == null) { // 多表关联缺少where筛选条件
                RuleResult ruleResult = new RuleResult(ctx.start, ctx.stop);
                ruleResultList.add(ruleResult);
                logger.debug(getIndentString(ruleResult.toString()));
            }

            unindent();
            logger.debug(getIndentString("QuerySpecification exit"));
        }

        /* join 表达式 */
        @Override
        public void enterInnerJoin(GBaseParser.InnerJoinContext ctx) {
            enterJoinPart(ctx.expression());
        }

        @Override
        public void exitInnerJoin(GBaseParser.InnerJoinContext ctx) {
            exitJoinPart();
        }

        @Override
        public void enterStraightJoin(GBaseParser.StraightJoinContext ctx) {
            enterJoinPart(ctx.expression());
        }

        @Override
        public void exitStraightJoin(GBaseParser.StraightJoinContext ctx) {
            exitJoinPart();
        }

        @Override
        public void enterOuterJoin(GBaseParser.OuterJoinContext ctx) {
            enterJoinPart(ctx.expression());
        }

        @Override
        public void exitOuterJoin(GBaseParser.OuterJoinContext ctx) {
            exitJoinPart();
        }

        private void enterJoinPart(GBaseParser.ExpressionContext ctx) {
            logger.debug(getIndentString("JoinPart enter"));
            Rule003JoinExpressionListener rule003JoinExpressionListener = new Rule003JoinExpressionListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(rule003JoinExpressionListener, ctx);
            ruleResultList.addAll(rule003JoinExpressionListener.getRuleResultList());
        }

        private void exitJoinPart() {
            logger.debug(getIndentString("JoinPart exit"));
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

    /**
     * 判断join条件表达式是否包含非关联条件并记录
     * 1. is/between/like 等为非关联条件
     * 2. 二元比较运算符需左右均包含列名
     */
    private class Rule003JoinExpressionListener extends GBaseParserBaseListener {
        private List<RuleResult> ruleResultList = new ArrayList<>();

        List<RuleResult> getRuleResultList() {
            return ruleResultList;
        }

        @Override
        public void enterIsExpression(GBaseParser.IsExpressionContext ctx) {
            logger.debug(getIndentString("Found IsExpression"));
            dealUnRelatePredicate(ctx.start, ctx.stop);
        }

        @Override
        public void enterInPredicate(GBaseParser.InPredicateContext ctx) {
            logger.debug(getIndentString("Found InPredicate"));
            dealUnRelatePredicate(ctx.start, ctx.stop);
        }

        @Override
        public void enterIsNullPredicate(GBaseParser.IsNullPredicateContext ctx) {
            logger.debug(getIndentString("Found IsNullPredicate"));
            dealUnRelatePredicate(ctx.start, ctx.stop);
        }

        @Override
        public void enterSubqueryComparasionPredicate(GBaseParser.SubqueryComparasionPredicateContext ctx) {
            logger.debug(getIndentString("Found SubqueryComparasionPredicate"));
            dealUnRelatePredicate(ctx.start, ctx.stop);
        }

        @Override
        public void enterBetweenPredicate(GBaseParser.BetweenPredicateContext ctx) {
            logger.debug(getIndentString("Found BetweenPredicate"));
            dealUnRelatePredicate(ctx.start, ctx.stop);
        }

        @Override
        public void enterSoundsLikePredicate(GBaseParser.SoundsLikePredicateContext ctx) {
            logger.debug(getIndentString("Found SoundsLikePredicate"));
            dealUnRelatePredicate(ctx.start, ctx.stop);
        }

        @Override
        public void enterLikePredicate(GBaseParser.LikePredicateContext ctx) {
            logger.debug(getIndentString("Found LikePredicate"));
            dealUnRelatePredicate(ctx.start, ctx.stop);
        }

        @Override
        public void enterBinaryComparasionPredicate(GBaseParser.BinaryComparasionPredicateContext ctx) {
            logger.debug(getIndentString("Found BinaryComparasionPredicate"));
            if (isColumnPredicate(ctx.left) && isColumnPredicate(ctx.right)) {
                logger.debug(getIndentString("Join Condition"));
            } else {
                dealUnRelatePredicate(ctx.start, ctx.stop);
            }
        }

        private boolean isColumnPredicate(GBaseParser.PredicateContext ctx) {
            return ParseTreeUtils.getDescendantClassSet(ctx).contains(GBaseParser.FullColumnNameContext.class.getSimpleName());
        }

        private void dealUnRelatePredicate(Token start, Token stop) {
            RuleResult ruleResult = new RuleResult(start, stop);
            ruleResultList.add(ruleResult);
            logger.debug(getIndentString(ruleResult.toString()));
        }
    }

}
