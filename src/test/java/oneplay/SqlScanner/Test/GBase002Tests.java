package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.GBase.GBase002;
import oneplay.SqlScanner.rules.MySql.MySql002;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase002Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);
    private String path = "D:\\IdeaProject\\SqlScanner\\examples\\002避免在筛选条件中对列进行加工转换.sql";

    @Test
    public void test002() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("GBase", new FileInputStream(new File(path)));
        GBase002 GBase002 = new GBase002();
        logger.info("Matching ...");
        if (!GBase002.match(parseTree).isEmpty()) {
            GBase002.printRuleInfo();
        }
    }

    @Test
    public void test002mysql() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        BaseRule rule = new MySql002();
        logger.info("Matching ...");
        if (!rule.match(parseTree).isEmpty()) {
            rule.printRuleInfo();
        }
    }

}
