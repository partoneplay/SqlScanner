package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.antlr.NodeName;
import oneplay.SqlScanner.rules.RuleResult;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GBase004 extends BaseRule {
    private static Logger logger = LogManager.getLogger(GBase004.class);

    @Override
    public List<RuleResult> match(ParseTree parseTree) {
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        Rule004Listener rule004Listener = new Rule004Listener();
        parseTreeWalker.walk(rule004Listener, parseTree);
        return rule004Listener.getRuleResultList();
    }

    /**
     * 算法描述：避免使用not in 运算
     */
    private class Rule004Listener extends GBaseParserBaseListener {
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
            sqlStructure.push(NodeName.querySpecification); // 递归分隔
            indent();
        }

        private void exitSelect() {
            if (sqlStructure.peek() == NodeName.querySpecification) {
                sqlStructure.pop();
            }
            unindent();
            logger.debug(getIndentString("QuerySpecification exit"));
        }

        @Override
        public void enterInPredicate(GBaseParser.InPredicateContext ctx) {
            if (ctx.NOT() != null && ctx.selectStatement() != null) {
                RuleResult ruleResult = new RuleResult(ctx.start, ctx.stop, "'not in (subquery)' isn't allowed here");
                ruleResultList.add(ruleResult);
                logger.debug(getIndentString(ruleResult.toString()));
            }
        }

    }

}
