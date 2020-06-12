package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.RuleResult;
import oneplay.SqlScanner.utils.ParseTreeUtils;
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
     * 算法描述：INSERT INTO SELECT 结构中明确指定列名
     */
    private class Rule004Listener extends GBaseParserBaseListener {
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
        public void enterInsertStatement(GBaseParser.InsertStatementContext ctx) {
            if (ctx.columns == null) {
                dealRuleResult(ctx.start, ctx.insertStatementValue().start, "Missing insert columns");
            }
            GBaseParser.SelectStatementContext selectStatementContext = ctx.insertStatementValue().selectStatement();
            if (selectStatementContext != null) {
                List<ParseTree> parseTreeList = ParseTreeUtils.getFirstNodeList(selectStatementContext, GBaseParser.SelectElementsContext.class);
                for (ParseTree parseTree : parseTreeList) {
                    GBaseParser.SelectElementsContext selectElementsContext = (GBaseParser.SelectElementsContext) parseTree;
                    if (selectElementsContext.star != null) {
                        dealRuleResult(selectElementsContext.start, selectElementsContext.stop, "Please don't use '*'");
                    }
                }
            }
        }

        private void dealRuleResult(Token start, Token stop, String s) {
            RuleResult ruleResult = new RuleResult(start, stop, s);
            ruleResultList.add(ruleResult);
            logger.debug(ruleResult.toString());
        }

    }

}
