package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.MySql.MySql004;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase004Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);

    @Test
    public void test004() throws Exception {
        String path = "D:\\IdeaProject\\SqlScanner\\examples\\004避免使用not in.sql";
        logger.info(path);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        MySql004 mySql004 = new MySql004();
        logger.info("Matching ...");
        if (!mySql004.match(parseTree).isEmpty()) {
            mySql004.printRuleInfo();
        }
    }

}
