package oneplay.SqlScanner.rules.GBase;

import oneplay.SqlScanner.antlr.GBase.GBaseParser;
import oneplay.SqlScanner.antlr.GBase.GBaseParserBaseListener;
import oneplay.SqlScanner.rules.BaseRule;
import oneplay.SqlScanner.antlr.NodeName;
import oneplay.SqlScanner.rules.RuleResult;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GBase002 extends BaseRule {
    private static Logger logger = LogManager.getLogger(GBase002.class);

    @Override
    public List<RuleResult> match(ParseTree parseTree) {
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        GBase002.Rule002Listener rule002Listener = new GBase002.Rule002Listener();
        parseTreeWalker.walk(rule002Listener, parseTree);
        return rule002Listener.getRuleResultList();
    }

    /**
     * 算法描述：筛选条件中，避免对列使用函数或其他运算符
     * 1. 需明确判断范围实在筛选条件内， 查询列可使用函数或其他运算符
     * 2. 递归进行处理判断
     */
    private class Rule002Listener extends GBaseParserBaseListener {
        private Stack<NodeName> sqlStructure = new Stack<>();
        private List<RuleResult> ruleResultList = new ArrayList<>();

        List<RuleResult> getRuleResultList() {
            return ruleResultList;
        }

        @Override
        public void enterDmlStatement(GBaseParser.DmlStatementContext ctx) {
            logger.debug(getIndentString("DmlStatement begin ..."));
        }

        @Override
        public void exitDmlStatement(GBaseParser.DmlStatementContext ctx) {
            logger.debug(getIndentString("DmlStatement end\n"));
        }

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
            logger.debug(getIndentString("QuerySpecification enter"));
            sqlStructure.push(NodeName.querySpecification); // 递归分隔
            indent();
        }

        private void exitSelect() {
            if (sqlStructure.peek() == NodeName.querySpecification) {
                sqlStructure.pop();
            }
            unindent();
            logger.debug(getIndentString("QuerySpecification exit"));
        }

        @Override
        public void enterFromClause(GBaseParser.FromClauseContext ctx) {
            enterConditionClause();
        }

        @Override
        public void exitFromClause(GBaseParser.FromClauseContext ctx) {
            exitConditionClause();
        }

        @Override
        public void enterDeleteStatement(GBaseParser.DeleteStatementContext ctx) {
            enterConditionClause();
        }

        @Override
        public void exitDeleteStatement(GBaseParser.DeleteStatementContext ctx) {
            exitConditionClause();
        }

        @Override
        public void enterUpdateStatement(GBaseParser.UpdateStatementContext ctx) {
            if (ctx.singleUpdateStatement() != null && ctx.singleUpdateStatement().expression() != null) {
                enterConditionClause();
            } else if (ctx.multipleUpdateStatement() != null && ctx.multipleUpdateStatement().expression() != null) {
                enterConditionClause();
            }
        }

        @Override
        public void exitUpdateStatement(GBaseParser.UpdateStatementContext ctx) {
            if (ctx.singleUpdateStatement() != null && ctx.singleUpdateStatement().expression() != null) {
                exitConditionClause();
            } else if (ctx.multipleUpdateStatement() != null && ctx.multipleUpdateStatement().expression() != null) {
                exitConditionClause();
            }
        }

        @Override
        public void enterUpdatedElement(GBaseParser.UpdatedElementContext ctx) {
            logger.debug(getIndentString("UpdatedElement enter"));
            sqlStructure.push(NodeName.ignored);
        }

        @Override
        public void exitUpdatedElement(GBaseParser.UpdatedElementContext ctx) {
            logger.debug(getIndentString("UpdatedElement exit"));
            if (sqlStructure.peek() == NodeName.ignored) {
                sqlStructure.pop();
            }
        }

        @Override
        public void enterInnerJoin(GBaseParser.InnerJoinContext ctx) {
            if (ctx.expression() != null) {
                enterConditionClause();
            }
        }

        @Override
        public void exitInnerJoin(GBaseParser.InnerJoinContext ctx) {
            if (ctx.expression() != null) {
                exitConditionClause();
            }
        }

        @Override
        public void enterStraightJoin(GBaseParser.StraightJoinContext ctx) {
            if (ctx.expression() != null) {
                enterConditionClause();
            }
        }

        @Override
        public void exitStraightJoin(GBaseParser.StraightJoinContext ctx) {
            if (ctx.expression() != null) {
                exitConditionClause();
            }
        }

        @Override
        public void enterOuterJoin(GBaseParser.OuterJoinContext ctx) {
            if (ctx.expression() != null) {
                enterConditionClause();
            }
        }

        @Override
        public void exitOuterJoin(GBaseParser.OuterJoinContext ctx) {
            if (ctx.expression() != null) {
                exitConditionClause();
            }
        }

        private void enterConditionClause() {
            logger.debug(getIndentString("FromClause enter"));
            sqlStructure.push(NodeName.conditionClause);
        }

        private void exitConditionClause() {
            if (sqlStructure.peek() == NodeName.conditionClause) {
                sqlStructure.pop();
            }
            logger.debug(getIndentString("FromClause exit"));
        }


        @Override
        public void enterFullColumnName(GBaseParser.FullColumnNameContext ctx) {
            if (sqlStructure.peek() == NodeName.ignored) {
                return;
            }
            if (sqlStructure.peek() == NodeName.conditionClause) {
                ParserRuleContext ppCtx = ctx.getParent().getParent();
                if (ppCtx.getChildCount() > 1) {
                    RuleResult ruleResult = new RuleResult(ppCtx.start, ppCtx.stop, String.format("Column in expression [%s]", ppCtx.getText()));
                    ruleResultList.add(ruleResult);
                    logger.debug(getIndentString(ruleResult.toString()));
                }
            }
        }
    }

}
