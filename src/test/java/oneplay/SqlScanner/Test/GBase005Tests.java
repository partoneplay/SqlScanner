package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.MySql.MySql005;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase005Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);

    @Test
    public void test005() throws Exception {
        String path = "D:\\IdeaProject\\SqlScanner\\examples\\005在INSERT INTO SELECT结构中明确指定列名.sql";
        logger.info(path);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        MySql005 mySql005 = new MySql005();
        logger.info("Matching ...");
        if (!mySql005.match(parseTree).isEmpty()) {
            mySql005.printRuleInfo();
        }
    }

}
