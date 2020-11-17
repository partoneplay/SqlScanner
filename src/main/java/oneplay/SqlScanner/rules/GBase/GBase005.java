package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.RuleResult;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class GBase005 extends BaseRule {
    private static Logger logger = LogManager.getLogger(GBase005.class);

    @Override
    public List<RuleResult> match(ParseTree parseTree) {
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        Rule004Listener rule004Listener = new Rule004Listener();
        parseTreeWalker.walk(rule004Listener, parseTree);
        return rule004Listener.getRuleResultList();
    }

    /**
     * 算法描述：
     * 1. INSERT INTO TABLE 结构中明确指定列名
     * 2. SELECT FROM TABLE 结构中明确指定列名
     */
    private class Rule004Listener extends GBaseParserBaseListener {
        private List<RuleResult> ruleResultList = new ArrayList<>();

        List<RuleResult> getRuleResultList() {
            return ruleResultList;
        }

        @Override
        public void enterInsertStatement(GBaseParser.InsertStatementContext ctx) {
            if (ctx.columns == null) {
                dealRuleResult(ctx.start, ctx.insertStatementValue().start, "`insert`语句未明确指定列名/Missing insert columns");
            }
        }

        @Override
        public void enterSelectElements(GBaseParser.SelectElementsContext ctx) {
            if (ctx.star != null) {
                dealRuleResult(ctx.start, ctx.stop, "`select`语句未明确指定列名/Missing select columns");
            }
        }

        private void dealRuleResult(Token start, Token stop, String description) {
            RuleResult ruleResult = new RuleResult(start, stop, description);
            ruleResultList.add(ruleResult);
            logger.debug(ruleResult.toString());
        }

    }

}
