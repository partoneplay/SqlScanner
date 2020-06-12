package oneplay.SqlScanner.rules;

import oneplay.SqlScanner.utils.RuleInfoUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseRule {
    private static Logger logger = LogManager.getLogger(BaseRule.class);
    private static final int INDENT = 1;
    private int indent = 0;

    private String ruleId = "schema.000";

    public BaseRule () {
        String packageName = this.getClass().getPackage().getName();
        String simplePackageName = packageName.substring(packageName.lastIndexOf(".") + 1, packageName.length());
        String simpleClassName = this.getClass().getSimpleName();
        ruleId = simplePackageName + "." + simpleClassName.substring(simplePackageName.length(), simpleClassName.length());
    }

    public List<RuleResult> match(ParseTree parseTree) {
        return new ArrayList<>();
    }

    public void printRuleInfo() {
        String schema = ruleId.substring(0, ruleId.lastIndexOf('.'));
        RuleInfo ruleInfo = RuleInfoUtils.getRuleInfo(schema, ruleId);
        if (ruleInfo != null) {
            logger.info(ruleInfo.toMarkdown());
        }
    }

    public String getRuleId() {
        return ruleId;
    }

    public String getIndentString(String s) {
        return String.join("", Collections.nCopies(indent, "\t")) + s;
    }

    public void indent() {
        indent += INDENT;
    }

    public void unindent() {
        indent -= INDENT;
    }

}
