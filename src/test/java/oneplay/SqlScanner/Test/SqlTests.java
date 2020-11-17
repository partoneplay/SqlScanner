package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.lineage.GBase.LineageListener;
import oneplay.SqlScanner.lineage.LineageInfo;
import oneplay.SqlScanner.utils.DatetimeUtils;
import oneplay.SqlScanner.utils.FileUtils;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;

public class SqlTests {

    @Test
    public void test() throws Exception {
        Configurator.setAllLevels("oneplay.SqlScanner", Level.DEBUG);
        String path = "D:\\IdeaProject\\SqlScanner\\examples\\test.sql";
        ParseTree parseTree = ParseTreeUtils.getParseTree("GBase", new FileInputStream(new File(path)));
        ParseTreeWalker walker = new ParseTreeWalker();
        LineageListener lineageListener = new LineageListener();
        walker.walk(lineageListener, parseTree);
        Set<String> mermaidSet = new HashSet<>();
        for (LineageInfo lineageInfo : lineageListener.getLineageInfoList()) {
            mermaidSet.addAll(lineageInfo.toMermaidList());
        }
        for (String str : mermaidSet) {
            System.out.println(str);
        }
    }

    @Test
    public void  test2() throws Exception {
        String format = "yyyy-MM-dd HH:mm:ss";
        String now = DatetimeUtils.now(format);
        System.out.println(now);
        Thread.sleep(2000);
        System.out.println(DatetimeUtils.secondsPassed(now, format));
        String dir = "C:\\Users\\oneplay\\Desktop\\代码扫描集成demo示例\\";
        for (String str : FileUtils.getAllAbsoluteFiles(dir)) {
            System.out.println(str);
            System.out.println(FileUtils.getRelativePath(str, dir));
        }

        System.out.println(FileUtils.getFileClipContent("D:\\IdeaProject\\SqlScanner\\examples\\001多表关联聚合时优先聚合计算.sql", 4, 0, 12,10));

    }

}
