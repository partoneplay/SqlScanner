package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import oneplay.SqlScanner.rules.MySql.MySql003;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class GBase003Tests {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);

    @Test
    public void test003() throws Exception {
        String path = "D:\\IdeaProject\\SqlScanner\\examples\\003关联查询缺少筛选条件.sql";
        logger.info(path);
        ParseTree parseTree = ParseTreeUtils.getParseTree("MySql", new FileInputStream(new File(path)));
        MySql003 mySql003 = new MySql003();
        logger.info("Matching ...");
        if (!mySql003.match(parseTree).isEmpty()) {
            mySql003.printRuleInfo();
        }
    }

}
