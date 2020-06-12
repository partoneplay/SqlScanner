package oneplay.SqlScanner.utils;

import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.rules.RuleInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;


/**
 * 读取规则说明文件解析处理
 */
public class RuleInfoUtils {
    private static Logger logger = LogManager.getLogger(RuleInfoUtils.class);

    /**
     * 获取指定规则的描述性说明
     * @param schema 配置文件名
     * @param id 规则id
     * @return RuleInfo
     */
    public static RuleInfo getRuleInfo(String schema, String id) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(RuleInfoUtils.class.getResourceAsStream("/" + schema + ".xml"));
            XPath xPath = XPathFactory.newInstance().newXPath();
            String expression = String.format("/Rules/Rule[@id='%s']", id);
            Element element = (Element) xPath.compile(expression).evaluate(document, XPathConstants.NODE);
            return element == null ? null : new RuleInfo(id,
                    element.getElementsByTagName("Summary").item(0).getTextContent(),
                    element.getElementsByTagName("Content").item(0).getTextContent(),
                    element.getElementsByTagName("Example").item(0).getTextContent()
            );
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 读取指定规则配置文件中的规则，并实例化规则
     * @param schema 配置文件名
     * @return 全部规则实例
     */
    public static List<BaseRule> getRuleInstanceList(String schema) {
        List<BaseRule> baseRuleList = new ArrayList<>();
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(RuleInfoUtils.class.getResourceAsStream("/" + schema + ".xml"));
            NodeList nodeList = document.getElementsByTagName("Rule");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                String id = node.getAttributes().getNamedItem("id").getNodeValue();
                String packageName = BaseRule.class.getPackage().getName() + "." + id.substring(0, id.lastIndexOf('.'));
                String fullClassName = packageName + "." + id.replaceAll("\\.", "");
                Class<?> clazz = Class.forName(fullClassName);
                Constructor<?> constructor = clazz.getConstructor();
                BaseRule baseRule = (BaseRule) constructor.newInstance();
                baseRuleList.add(baseRule);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return baseRuleList;
    }

}
