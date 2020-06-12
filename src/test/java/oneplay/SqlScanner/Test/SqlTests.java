package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.GBase.*;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.File;
import java.io.FileInputStream;

public class SqlTests {

    @Test
    public void test() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        String path = "E:\\antlr4\\gbase\\test.sql";
        try {
            ParseTree parseTree = ParseTreeUtils.getParseTree("GBase", new FileInputStream(new File(path)));
        } catch (Exception e) {
            System.out.println("XXXXXXXXXXXXXXXXXX");
        }

//        BaseRule baseRule = new GBase002();
//        if (!baseRule.match(parseTree).isEmpty()) {
//            baseRule.printRuleInfo();
//        }
    }

}
