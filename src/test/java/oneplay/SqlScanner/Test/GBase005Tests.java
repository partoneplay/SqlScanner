package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.GBase.GBase005;
import oneplay.SqlScanner.rules.MySql.MySql005;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase005Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);
    private String path = "D:\\IdeaProject\\SqlScanner\\examples\\005始终明确指定列名.sql";

    @Test
    public void test005() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("GBase", new FileInputStream(new File(path)));
        GBase005 GBase005 = new GBase005();
        logger.info("Matching ...");
        if (!GBase005.match(parseTree).isEmpty()) {
            GBase005.printRuleInfo();
        }
    }

    @Test
    public void test005mysql() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        BaseRule rule = new MySql005();
        logger.info("Matching ...");
        if (!rule.match(parseTree).isEmpty()) {
            rule.printRuleInfo();
        }
    }

}
