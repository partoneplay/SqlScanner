package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.GBase.GBase003;
import oneplay.SqlScanner.rules.MySql.MySql003;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase003Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);
    private String path = "D:\\IdeaProject\\SqlScanner\\examples\\003多表关联始终指定合理筛选条件.sql";

    @Test
    public void test003() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("GBase", new FileInputStream(new File(path)));
        GBase003 GBase003 = new GBase003();
        logger.info("Matching ...");
        if (!GBase003.match(parseTree).isEmpty()) {
            GBase003.printRuleInfo();
        }
    }

    @Test
    public void test003mysql() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        BaseRule rule = new MySql003();
        logger.info("Matching ...");
        if (!rule.match(parseTree).isEmpty()) {
            rule.printRuleInfo();
        }
    }

}
