package oneplay.SqlScanner.utils;

import oneplay.SqlScanner.antlr.GBase.GBaseLexer;
import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.MySql.MySqlLexer;
import oneplay.SqlScanner.antlr.MySql.MySqlParser;
import oneplay.SqlScanner.config.CaseChangingCharStream;
import oneplay.SqlScanner.config.ErrorListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 语法树工具集
 */
public class ParseTreeUtils {

    /**
     * 获取语法树全部后代节点的类名
     *
     * @param parseTree 语法树
     * @return 类名集合
     */
    public static Set<String> getDescendantClassSet(ParseTree parseTree) {
        Set<String> descendant = new HashSet<>();
        for (int i = 0; i < parseTree.getChildCount(); i++) {
            ParseTree child = parseTree.getChild(i);
            descendant.add(child.getClass().getSimpleName());
            if (child instanceof ParserRuleContext) {
                descendant.addAll(getDescendantClassSet(child));
            }
        }
        return descendant;
    }

    /**
     * 获取语法树第一层指定类型的节点
     *
     * @param parseTree 语法树
     * @param clazz     指定节点类型
     * @return 匹配的节点列表
     */
    public static List<ParseTree> getFirstNodeList(ParseTree parseTree, Class<?> clazz) {
        List<ParseTree> parseTreeList = new ArrayList<>();
        for (int i = 0; i < parseTree.getChildCount(); i++) {
            ParseTree child = parseTree.getChild(i);
            if (child.getClass().getSimpleName().equals(clazz.getSimpleName())) {
                parseTreeList.add(child);
            } else {
                parseTreeList.addAll(getFirstNodeList(child, clazz));
            }
        }
        return parseTreeList;
    }

    /**
     * 根据语法名、输入流构建语法树
     *
     * @param schema 语法名
     * @param inputStream     输入流
     * @return 语法树
     * @throws IOException IO
     */
    public static ParseTree getParseTree(String schema, InputStream inputStream) throws IOException, RecognitionException {
        CharStream charStream = CharStreams.fromStream(inputStream);
        CaseChangingCharStream upperCharStream = new CaseChangingCharStream(charStream, true);
        if (schema.equals("MySql")) {
            MySqlLexer mySqlLexer = new MySqlLexer(upperCharStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(mySqlLexer);
            MySqlParser mySqlParser = new MySqlParser(commonTokenStream);
            return mySqlParser.root();
        }
        if (schema.equals("GBase")) {
            GBaseLexer GBaseLexer = new GBaseLexer(upperCharStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(GBaseLexer);
            GBaseParser gbaseParser = new GBaseParser(commonTokenStream);
            gbaseParser.removeErrorListeners();
            gbaseParser.addErrorListener(new ErrorListener());
            return gbaseParser.root();
        }
        return null;
    }

}
