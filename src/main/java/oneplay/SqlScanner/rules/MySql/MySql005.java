package oneplay.SqlScanner.rules.MySql;

import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.GBase.GBase005;
import oneplay.SqlScanner.rules.RuleResult;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MySql005 extends BaseRule {
    private static Logger logger = LogManager.getLogger(MySql005.class);

    @Override
    public List<RuleResult> match(ParseTree parseTree) {
        return new GBase005().match(parseTree);
    }

}
