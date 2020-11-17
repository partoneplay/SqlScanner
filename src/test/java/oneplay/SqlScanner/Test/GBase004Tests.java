package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.GBase.GBase004;
import oneplay.SqlScanner.rules.MySql.MySql004;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase004Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);
    private String path = "D:\\IdeaProject\\SqlScanner\\examples\\004避免使用NOT IN、不等于作为筛选条件.sql";

    @Test
    public void test004() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("GBase", new FileInputStream(new File(path)));
        GBase004 GBase004 = new GBase004();
        logger.info("Matching ...");
        if (!GBase004.match(parseTree).isEmpty()) {
            GBase004.printRuleInfo();
        }
    }

    @Test
    public void test004mysql() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        BaseRule rule = new MySql004();
        logger.info("Matching ...");
        if (!rule.match(parseTree).isEmpty()) {
            rule.printRuleInfo();
        }
    }

}
