package oneplay.SqlScanner;

import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.RuleResult;
import oneplay.SqlScanner.utils.FileScanner;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import oneplay.SqlScanner.utils.RuleInfoUtils;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

public class SqlScanner extends FileScanner {
    private static Logger logger = LogManager.getLogger(SqlScanner.class);
    private List<BaseRule> baseRuleList;

    public SqlScanner(String schema) {
        super(schema);
        baseRuleList = RuleInfoUtils.getRuleInstanceList(schema);
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
        sqlScanner.scan(Arrays.copyOfRange(args, 1, args.length));
    }

}
