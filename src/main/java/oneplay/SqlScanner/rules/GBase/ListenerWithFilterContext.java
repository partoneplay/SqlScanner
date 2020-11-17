package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.antlr.NodeName;
import oneplay.SqlScanner.utils.IndentUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Stack;

/**
 * 可定位筛选条件上下文
 */
public class ListenerWithFilterContext extends GBaseParserBaseListener {
    private static Logger logger = LogManager.getLogger(ListenerWithFilterContext.class);

    private Stack<NodeName> sqlStructure = new Stack<>();
    private IndentUtils indentUtils = new IndentUtils();

    @Override
    public void enterQuerySpecification(GBaseParser.QuerySpecificationContext ctx) {
        enterSelect();
    }

    @Override
    public void exitQuerySpecification(GBaseParser.QuerySpecificationContext ctx) {
        exitSelect();
    }

    @Override
    public void enterQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx) {
        enterSelect();
    }

    @Override
    public void exitQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx) {
        exitSelect();
    }

    private void enterSelect() {
        logger.debug(indentUtils.getIndentString("QuerySpecification enter"));
        sqlStructure.push(NodeName.querySpecification); // 递归分隔
        indentUtils.indent();
    }

    private void exitSelect() {
        if (sqlStructure.peek() == NodeName.querySpecification) {
            sqlStructure.pop();
        }
        indentUtils.unindent();
        logger.debug(indentUtils.getIndentString("QuerySpecification exit"));
    }

    @Override
    public void enterFromClause(GBaseParser.FromClauseContext ctx) {
        enterFilterClause();
    }

    @Override
    public void exitFromClause(GBaseParser.FromClauseContext ctx) {
        exitFilterClause();
    }

    @Override
    public void enterDeleteStatement(GBaseParser.DeleteStatementContext ctx) {
        enterFilterClause();
    }

    @Override
    public void exitDeleteStatement(GBaseParser.DeleteStatementContext ctx) {
        exitFilterClause();
    }

    @Override
    public void enterUpdateStatement(GBaseParser.UpdateStatementContext ctx) {
        if (ctx.singleUpdateStatement() != null && ctx.singleUpdateStatement().expression() != null) {
            enterFilterClause();
        } else if (ctx.multipleUpdateStatement() != null && ctx.multipleUpdateStatement().expression() != null) {
            enterFilterClause();
        }
    }

    @Override
    public void exitUpdateStatement(GBaseParser.UpdateStatementContext ctx) {
        if (ctx.singleUpdateStatement() != null && ctx.singleUpdateStatement().expression() != null) {
            exitFilterClause();
        } else if (ctx.multipleUpdateStatement() != null && ctx.multipleUpdateStatement().expression() != null) {
            exitFilterClause();
        }
    }

    @Override
    public void enterUpdatedElement(GBaseParser.UpdatedElementContext ctx) {
        logger.debug(indentUtils.getIndentString("UpdatedElement enter"));
        sqlStructure.push(NodeName.ignored);
    }

    @Override
    public void exitUpdatedElement(GBaseParser.UpdatedElementContext ctx) {
        logger.debug(indentUtils.getIndentString("UpdatedElement exit"));
        if (sqlStructure.peek() == NodeName.ignored) {
            sqlStructure.pop();
        }
    }

    @Override
    public void enterInnerJoin(GBaseParser.InnerJoinContext ctx) {
        if (ctx.expression() != null) {
            enterFilterClause();
        }
    }

    @Override
    public void exitInnerJoin(GBaseParser.InnerJoinContext ctx) {
        if (ctx.expression() != null) {
            exitFilterClause();
        }
    }

    @Override
    public void enterStraightJoin(GBaseParser.StraightJoinContext ctx) {
        if (ctx.expression() != null) {
            enterFilterClause();
        }
    }

    @Override
    public void exitStraightJoin(GBaseParser.StraightJoinContext ctx) {
        if (ctx.expression() != null) {
            exitFilterClause();
        }
    }

    @Override
    public void enterOuterJoin(GBaseParser.OuterJoinContext ctx) {
        if (ctx.expression() != null) {
            enterFilterClause();
        }
    }

    @Override
    public void exitOuterJoin(GBaseParser.OuterJoinContext ctx) {
        if (ctx.expression() != null) {
            exitFilterClause();
        }
    }

    private void enterFilterClause() {
        logger.debug(indentUtils.getIndentString("Filter Clause enter"));
        sqlStructure.push(NodeName.filterClause);
    }

    private void exitFilterClause() {
        if (sqlStructure.peek() == NodeName.filterClause) {
            sqlStructure.pop();
        }
        logger.debug(indentUtils.getIndentString("Filter Clause exit"));
    }

    /**
     *  不可被继承修改
     */
    final boolean isFilterContext() {
        return sqlStructure.peek() == NodeName.filterClause;
    }

}
