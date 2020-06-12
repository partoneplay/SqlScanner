package oneplay.SqlScanner;

import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.GBase.GBase001;
import oneplay.SqlScanner.rules.RuleResult;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import oneplay.SqlScanner.utils.RuleInfoUtils;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

public class SqlScanner {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);

    private String schema;
    private List<BaseRule> baseRuleList;

    public SqlScanner(String schema) {
        this.schema = schema;
        baseRuleList = RuleInfoUtils.getRuleInstanceList(schema);
    }

    private void scan(File file) {
        if (file.isFile()) {
            scanFile(file);
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        scanFile(f);
                    } else if (f.isDirectory()) {
                        scan(f);
                    }
                }
            }
        }
    }

    private void scanFile(File file) {
        try {
            if (file.isFile()) {
                if (!file.getName().toLowerCase().endsWith(".sql")) {
                    logger.info("Skipping " + file.getAbsoluteFile());
                } else {
                    logger.info("Scanning " + file.getAbsoluteFile());
                    ParseTree parseTree = ParseTreeUtils.getParseTree(schema, new FileInputStream(file));
                    for (BaseRule baseRule : baseRuleList) {
                        List<RuleResult> ruleResultList = baseRule.match(parseTree);
                        if (!ruleResultList.isEmpty()) {
                            logger.info("命中规则 " + baseRule.getRuleId() + " " + file.getAbsoluteFile());
                            for (RuleResult ruleResult : ruleResultList) {
                                logger.info(ruleResult.toString());
                            }
                        }
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
        System.out.println("SqlScanner Powered by oneplay.\n");
        SqlScanner sqlScanner = new SqlScanner(args[0]);
        for (int i = 1; i < args.length; i++) {
            File file = new File(args[i]);
            if (file.exists()) {
                sqlScanner.scan(file);
            } else {
                logger.error(file.getAbsoluteFile() + " not exists !");
            }
        }
    }

}
