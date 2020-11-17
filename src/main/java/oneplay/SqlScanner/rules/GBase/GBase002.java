package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.antlr.NodeName;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.RuleResult;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GBase002 extends BaseRule {
    private static Logger logger = LogManager.getLogger(GBase002.class);

    @Override
    public List<RuleResult> match(ParseTree parseTree) {
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        GBase002.Rule002Listener rule002Listener = new GBase002.Rule002Listener();
        parseTreeWalker.walk(rule002Listener, parseTree);
        return rule002Listener.getRuleResultList();
    }

    /**
     * 算法描述：筛选条件中，避免对列使用函数或其他运算符
     */
    private class Rule002Listener extends ListenerWithFilterContext {
        private List<RuleResult> ruleResultList = new ArrayList<>();

        List<RuleResult> getRuleResultList() {
            return ruleResultList;
        }

        @Override
        public void enterFullColumnName(GBaseParser.FullColumnNameContext ctx) {
            if (isFilterContext()) {
                ParserRuleContext ppCtx = ctx.getParent().getParent();
                if (ppCtx.getChildCount() > 1) {
                    RuleResult ruleResult = new RuleResult(ppCtx.start, ppCtx.stop,
                            String.format("在筛选条件中对列进行加工转换/Column in expression [%s]", ppCtx.getText()));
                    ruleResultList.add(ruleResult);
                    logger.debug(ruleResult.toString());
                }
            }
        }
    }

}
