package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.RuleResult;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

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
    private class Rule004Listener extends ListenerWithFilterContext {

        private List<RuleResult> ruleResultList = new ArrayList<>();

        List<RuleResult> getRuleResultList() {
            return ruleResultList;
        }

        @Override
        public void enterInPredicate(GBaseParser.InPredicateContext ctx) {
            if (ctx.NOT() != null && ctx.selectStatement() != null) {
                dealRuleResult(ctx.start, ctx.stop, "严禁`NOT IN`和子查询结合使用/'not in (subquery)' is not allowed");
            }
        }

        @Override
        public void enterBetweenPredicate(GBaseParser.BetweenPredicateContext ctx) {
            if (ctx.NOT() != null) {
                dealRuleResult(ctx.start, ctx.stop, "反向过滤条件/Reverse filter");
            }
        }

        @Override
        public void enterLikePredicate(GBaseParser.LikePredicateContext ctx) {
            if (ctx.NOT() != null) {
                dealRuleResult(ctx.start, ctx.stop, "反向过滤条件/Reverse filter");
            }
        }

        @Override
        public void enterRegexpPredicate(GBaseParser.RegexpPredicateContext ctx) {
            if (ctx.NOT() != null) {
                dealRuleResult(ctx.start, ctx.stop, "反向过滤条件/Reverse filter");
            }
        }

        @Override
        public void enterBinaryComparasionPredicate(GBaseParser.BinaryComparasionPredicateContext ctx) {
            String text = ctx.comparisonOperator().getText();
            if ("!=".equals(text) || "<>".equals(text)) {
                dealRuleResult(ctx.start, ctx.stop, "反向过滤条件/Reverse filter");
            }
        }

        private void dealRuleResult(Token start, Token stop, String description) {
            if (isFilterContext()) {
                RuleResult ruleResult = new RuleResult(start, stop, description);
                ruleResultList.add(ruleResult);
                logger.debug(ruleResult.toString());
            }
        }
    }

}
