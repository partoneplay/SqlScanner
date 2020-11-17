package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.GBase.GBase006;
import oneplay.SqlScanner.rules.MySql.MySql006;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase006Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);
    private String path = "D:\\IdeaProject\\SqlScanner\\examples\\006避免使用双竖杠操作符进行字符串连接.sql";

    @Test
    public void test006() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("GBase", new FileInputStream(new File(path)));
        GBase006 GBase006 = new GBase006();
        logger.info("Matching ...");
        if (!GBase006.match(parseTree).isEmpty()) {
            GBase006.printRuleInfo();
        }
    }

    @Test
    public void test006mysql() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        BaseRule rule = new MySql006();
        logger.info("Matching ...");
        if (!rule.match(parseTree).isEmpty()) {
            rule.printRuleInfo();
        }
    }

}
