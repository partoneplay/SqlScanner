package oneplay.SqlScanner.port.zbg;

import oneplay.SqlScanner.config.Log4jConfig;
import oneplay.SqlScanner.config.ResourceConfig;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.RuleInfo;
import oneplay.SqlScanner.rules.RuleResult;
import oneplay.SqlScanner.utils.DatetimeUtils;
import oneplay.SqlScanner.utils.FileUtils;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import oneplay.SqlScanner.utils.RuleInfoUtils;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class SqlCheckResult {
    private static Logger logger = LogManager.getLogger(SqlCheckResult.class);
    private static String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";

    private String schema;
    private String engineVersion;
    private String scanPath;
    private String resultPath;
    private String scanDate;

    private Properties properties = new Properties();
    private List<String> compile = new ArrayList<>();
    private Map<String, List<RuleResult>> resultDetail = new HashMap<>(32);

    public SqlCheckResult(String scanPath, String resultPath, String schema) {
        try {
            properties.load(ResourceConfig.getInputStream("zbg.properties"));
            this.engineVersion = properties.getProperty("engineVersion");
        } catch (IOException e) {
            logger.error("Count not find zbg.properties", e);
        }
        this.scanPath = scanPath;
        this.resultPath = resultPath;
        this.scanDate = DatetimeUtils.now(dateTimeFormat);
        this.schema = schema;
    }

    private void scan() {
        List<BaseRule> baseRuleList = RuleInfoUtils.getRuleInstanceList(schema);
        for (String file : FileUtils.getAllAbsoluteFiles(scanPath)) {
            try {
                ParseTree parseTree = ParseTreeUtils.getParseTree(schema, new FileInputStream(file));
                logger.info("Scanning file " + file);
                compile.add(FileUtils.getRelativePath(file, scanPath));
                for (BaseRule rule : baseRuleList) {
                    logger.info("Matching rule " + rule.getRuleId());
                    List<RuleResult> ruleResultList = rule.match(parseTree);
                    if (!ruleResultList.isEmpty()) {
                        for (RuleResult ruleResult : ruleResultList) {
                            ruleResult.setAbsolutePath(file);
                        }
                        if (resultDetail.containsKey(rule.getRuleId())) {
                            resultDetail.get(rule.getRuleId()).addAll(ruleResultList);
                        } else {
                            resultDetail.put(rule.getRuleId(), ruleResultList);
                        }
                    }
                }
            } catch (RecognitionException e) {
                logger.warn("Skipped unrecognizable file " + file);
            } catch (IOException e) {
                logger.error("Could not process " + file + " - " + e.getMessage(), e);
            }
        }
    }

    private void saveResultToXML() {
        Element projectEle = new Element("project");
        int timePassed = DatetimeUtils.secondsPassed(scanDate, dateTimeFormat);
        projectEle.addContent(new Element("engineVersion").setText(engineVersion));
        projectEle.addContent(new Element("scanPath").setText(scanPath));
        projectEle.addContent(new Element("resultPath").setText(resultPath));
        projectEle.addContent(new Element("scanDate").setText(scanDate));
        projectEle.addContent(new Element("scanTime").setText(timePassed + ""));

        Element compileEle = new Element("compile");
        for (String file : compile) {
            compileEle.addContent(new Element("File").setText(file));
        }

        Element resultDetailEle = new Element("resultDetail");
        for (Map.Entry<String, List<RuleResult>> entry : resultDetail.entrySet()) {
            RuleInfo ruleInfo = RuleInfoUtils.getRuleInfo(schema, entry.getKey());
            if (ruleInfo != null) {
                Element issueTypeEle = new Element("issueType");
                issueTypeEle.addContent(new Element("name_en").setText(ruleInfo.getEnglish()));
                issueTypeEle.addContent(new Element("name_cn").setText(ruleInfo.getChinese()));
                issueTypeEle.addContent(new Element("level").setText(ruleInfo.getLevel()));
                issueTypeEle.addContent(new Element("explain").setText(ruleInfo.getExplain()));
                issueTypeEle.addContent(new Element("recommendations").setText(ruleInfo.getRecommendation()));
                issueTypeEle.addContent(new Element("reference").setText(""));

                Element issuesEle = new Element("issues");
                for (RuleResult ruleResult : entry.getValue()) {
                    String absolutePath = ruleResult.getAbsolutePath();
                    Element issueEle = new Element("issue");
                    issueEle.addContent(new Element("codePath").setText(absolutePath));
                    issueEle.addContent(new Element("codeLineNumber").setText("" + ruleResult.getX1()));
                    String content = FileUtils.getFileClipContent(absolutePath, ruleResult.getX1(), ruleResult.getY1(), ruleResult.getX2(), ruleResult.getY2());
                    issueEle.addContent(new Element("codeContext").setText(content));
                    issueEle.addContent(new Element("codeDescription").setText(ruleResult.getDescription()));
                    issuesEle.addContent(issueEle);
                }
                issueTypeEle.addContent(issuesEle);
                resultDetailEle.addContent(issueTypeEle);
            }
        }

        Element sqlCheckResultEle = new Element("sqlCheckResult");
        sqlCheckResultEle.addContent(projectEle);
        sqlCheckResultEle.addContent(compileEle);
        sqlCheckResultEle.addContent(resultDetailEle);
        Document document = new Document(sqlCheckResultEle);
        try {
            FileUtils.touchFile(resultPath);
            try (FileOutputStream fileOutputStream = new FileOutputStream(resultPath)) {
                Format format = Format.getPrettyFormat();
                format.setEncoding("UTF-8");
                XMLOutputter xmlOutputter = new XMLOutputter(format);
                xmlOutputter.output(document, fileOutputStream);
            } catch (IOException e) {
                logger.error("Fail to save sqlCheckResult to file " + resultPath, e);
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("SqlCheck");
        if (args.length != 3) {
            System.out.println("Usage: scanPath resultPath schema");
            System.exit(-1);
        }
        Log4jConfig.config();
        String scanPath = args[0];
        String resultPath = args[1];
        String schema = args[2];
        if (schema.equalsIgnoreCase("GBase")) {
            schema = "GBase";
        } else if (schema.equalsIgnoreCase("MySql")) {
            schema = "MySql";
        } else {
            logger.error("Unsupported Schema " + schema);
            System.exit(-1);
        }
        SqlCheckResult sqlCheckResult = new SqlCheckResult(scanPath, resultPath, schema);
        sqlCheckResult.scan();
        logger.info("Scan Complete.");
        sqlCheckResult.saveResultToXML();
        logger.info("Scan Result Saved to " + resultPath);
    }

}
