package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.utils.RuleInfoUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RuleInfoUtilsTests {

    @Test
    public void getRulesTests() {
        System.out.println(this.getClass().getPackage().getName());
        List<BaseRule> baseRuleList = new ArrayList<>();
        baseRuleList.addAll(RuleInfoUtils.getRuleInstanceList("MySql"));
        baseRuleList.addAll(RuleInfoUtils.getRuleInstanceList("GBase"));
        for (BaseRule baseRule: baseRuleList) {
            System.out.println(baseRule.getRuleId());
        }
    }

}
