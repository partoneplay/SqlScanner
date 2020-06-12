package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.MySql.MySql002;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase002Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);

    @Test
    public void test002() throws Exception {
        String path = "D:\\IdeaProject\\SqlScanner\\examples\\002避免对列加工转换.sql";
        logger.info(path);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        MySql002 mySql002 = new MySql002();
        logger.info("Matching ...");
        if (!mySql002.match(parseTree).isEmpty()) {
            mySql002.printRuleInfo();
        }
    }

}
