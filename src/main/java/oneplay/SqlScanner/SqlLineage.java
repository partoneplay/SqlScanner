package oneplay.SqlScanner;

import oneplay.SqlScanner.lineage.GBase.LineageListener;
import oneplay.SqlScanner.lineage.LineageInfo;
import oneplay.SqlScanner.utils.FileScanner;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SqlLineage extends FileScanner {
    private static Logger logger = LogManager.getLogger(SqlLineage.class);
    private Set<String> mermaidSet = new HashSet<>();

    public SqlLineage(String schema) {
        super(schema);
    }

    public Set<String> getMermaidSet() {
        return mermaidSet;
    }

    @Override
    public void scanFile(File file) {
        try {
            if (file.isFile()) {
                if (!file.getName().toLowerCase().endsWith(".sql")) {
                    logger.info("Skipping " + file.getAbsoluteFile());
                } else {
                    logger.info("Scanning " + file.getAbsoluteFile());
                    ParseTree parseTree = ParseTreeUtils.getParseTree(getSchema(), new FileInputStream(file));
                    ParseTreeWalker walker = new ParseTreeWalker();
                    LineageListener lineageListener = new LineageListener();
                    walker.walk(lineageListener, parseTree);
                    for (LineageInfo lineageInfo : lineageListener.getLineageInfoList()) {
                        mermaidSet.addAll(lineageInfo.toMermaidList());
                    }
                }
            }
        } catch (RecognitionException e) {
            String msg = "SyntaxError";
            if (file != null) {
                msg += " " + file.getAbsolutePath();
            }
            logger.error(msg);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: [schema] /path/to/fileOrDir ...");
            System.exit(-1);
        }
        System.out.println("SqlLineage Powered by oneplay.\n");
        SqlLineage sqlLineage = new SqlLineage(args[0]);
        sqlLineage.scan(Arrays.copyOfRange(args, 1, args.length));
        Set<String> mermaidSet = sqlLineage.getMermaidSet();
        for (String str : mermaidSet) {
            System.out.println(str.toUpperCase());
        }
    }

}
