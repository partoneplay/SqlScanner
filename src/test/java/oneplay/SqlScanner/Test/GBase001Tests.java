package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.MySql.MySql001;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase001Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);

    @Test
    public void test001() throws Exception {
        String path = "D:\\IdeaProject\\SqlScanner\\examples\\001先聚合后关联.sql";
        logger.info(path);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        MySql001 mySql001 = new MySql001();
        logger.info("Matching ...");
        if (!mySql001.match(parseTree).isEmpty()) {
            mySql001.printRuleInfo();
        }
    }

}
