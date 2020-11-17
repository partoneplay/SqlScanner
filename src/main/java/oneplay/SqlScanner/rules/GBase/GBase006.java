package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.RuleResult;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class GBase006 extends BaseRule {
    private static Logger logger = LogManager.getLogger(GBase006.class);

    @Override
    public List<RuleResult> match(ParseTree parseTree) {
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        Rule006Listener rule006Listener = new Rule006Listener();
        parseTreeWalker.walk(rule006Listener, parseTree);
        return rule006Listener.getRuleResultList();
    }

    /**
     * 算法描述：避免使用`||`操作符进行字符串连接
     */
    private class Rule006Listener extends GBaseParserBaseListener {
        private List<RuleResult> ruleResultList = new ArrayList<>();

        List<RuleResult> getRuleResultList() {
            return ruleResultList;
        }

        @Override
        public void enterStringOperator(GBaseParser.StringOperatorContext ctx) {
            RuleResult ruleResult = new RuleResult(ctx.start, ctx.stop,
                    String.format("非规范的操作符/non-normative operator `%s`", ctx.getText()));
            ruleResultList.add(ruleResult);
            logger.debug(ruleResult.toString());
        }
    }

}
