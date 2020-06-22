package oneplay.SqlScanner.lineage.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.antlr.NodeName;
import oneplay.SqlScanner.lineage.LineageInfo;
import oneplay.SqlScanner.lineage.TableInfo;
import oneplay.SqlScanner.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 分析 INSERT INTO TABLE SELECT FROM TABLE 代码数据血统
 * 到表级
 */
public class LineageListener extends GBaseParserBaseListener {
    private static Logger logger = LogManager.getLogger(LineageListener.class);
    private Stack<NodeName> sqlStructure = new Stack<>();
    private List<LineageInfo> lineageInfoList = new ArrayList<>();
    private LineageInfo lineageInfo;

    public List<LineageInfo> getLineageInfoList() {
        return lineageInfoList;
    }

    @Override
    public void enterInsertStatement(GBaseParser.InsertStatementContext ctx) {
        logger.debug("InsertStatement enter");
        lineageInfo = new LineageInfo();
        lineageInfo.setToTable(new TableInfo(ctx.tableName().getText()));
        GBaseParser.SelectStatementContext selectStatementContext = ctx.insertStatementValue().selectStatement();
        if (selectStatementContext != null) {
            sqlStructure.push(NodeName.insertStatement);
        }
    }

    @Override
    public void exitInsertStatement(GBaseParser.InsertStatementContext ctx) {
        lineageInfoList.add(lineageInfo);
        sqlStructure.pop();
        logger.debug("InsertStatement exit");
    }

    @Override
    public void enterQuerySpecification(GBaseParser.QuerySpecificationContext ctx) {
        if (!sqlStructure.isEmpty() && sqlStructure.peek() == NodeName.insertStatement) {
            recordFromTableInfoList(ctx);
        }
    }

    @Override
    public void enterQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx) {
        if (!sqlStructure.isEmpty() && sqlStructure.peek() == NodeName.insertStatement) {
            recordFromTableInfoList(ctx);
        }
    }

    private void recordFromTableInfoList(ParseTree ctx) {
        for (ParseTree parseTree : ParseTreeUtils.getFirstNodeList(ctx, GBaseParser.AtomTableItemContext.class)) {
            if (parseTree instanceof GBaseParser.AtomTableItemContext) {
                lineageInfo.addFromTable(new TableInfo(((GBaseParser.AtomTableItemContext) parseTree).tableName().getText()));
            }
        }
    }

}
