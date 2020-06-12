// Generated from D:/IdeaProject/SqlScanner/src/main/java/oneplay/SqlScanner/antlr/GBase\GBaseParser.g4 by ANTLR 4.8
package oneplay.SqlScanner.antlr.GBase;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GBaseParser}.
 */
public interface GBaseParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GBaseParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(GBaseParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(GBaseParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(GBaseParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(GBaseParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(GBaseParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(GBaseParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(GBaseParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(GBaseParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(GBaseParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(GBaseParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(GBaseParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(GBaseParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStatement(GBaseParser.TransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStatement(GBaseParser.TransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplicationStatement(GBaseParser.ReplicationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplicationStatement(GBaseParser.ReplicationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreparedStatement(GBaseParser.PreparedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreparedStatement(GBaseParser.PreparedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(GBaseParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(GBaseParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void enterAdministrationStatement(GBaseParser.AdministrationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void exitAdministrationStatement(GBaseParser.AdministrationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void enterUtilityStatement(GBaseParser.UtilityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void exitUtilityStatement(GBaseParser.UtilityStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(GBaseParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(GBaseParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(GBaseParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(GBaseParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(GBaseParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(GBaseParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogfileGroup(GBaseParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogfileGroup(GBaseParser.CreateLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(GBaseParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(GBaseParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(GBaseParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(GBaseParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(GBaseParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(GBaseParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link GBaseParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCopyCreateTable(GBaseParser.CopyCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link GBaseParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCopyCreateTable(GBaseParser.CopyCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link GBaseParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterQueryCreateTable(GBaseParser.QueryCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link GBaseParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitQueryCreateTable(GBaseParser.QueryCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link GBaseParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterColumnCreateTable(GBaseParser.ColumnCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link GBaseParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitColumnCreateTable(GBaseParser.ColumnCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodb(GBaseParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodb(GBaseParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceNdb(GBaseParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceNdb(GBaseParser.CreateTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(GBaseParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(GBaseParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(GBaseParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(GBaseParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseOption(GBaseParser.CreateDatabaseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseOption(GBaseParser.CreateDatabaseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOwnerStatement(GBaseParser.OwnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOwnerStatement(GBaseParser.OwnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link GBaseParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreciseSchedule(GBaseParser.PreciseScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link GBaseParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreciseSchedule(GBaseParser.PreciseScheduleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link GBaseParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSchedule(GBaseParser.IntervalScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link GBaseParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSchedule(GBaseParser.IntervalScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void enterTimestampValue(GBaseParser.TimestampValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void exitTimestampValue(GBaseParser.TimestampValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpr(GBaseParser.IntervalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpr(GBaseParser.IntervalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void enterIntervalType(GBaseParser.IntervalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void exitIntervalType(GBaseParser.IntervalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#enableType}.
	 * @param ctx the parse tree
	 */
	void enterEnableType(GBaseParser.EnableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#enableType}.
	 * @param ctx the parse tree
	 */
	void exitEnableType(GBaseParser.EnableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(GBaseParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(GBaseParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(GBaseParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(GBaseParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter(GBaseParser.ProcedureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter(GBaseParser.ProcedureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(GBaseParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(GBaseParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineComment(GBaseParser.RoutineCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineComment(GBaseParser.RoutineCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineLanguage(GBaseParser.RoutineLanguageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineLanguage(GBaseParser.RoutineLanguageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBehavior(GBaseParser.RoutineBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBehavior(GBaseParser.RoutineBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineData(GBaseParser.RoutineDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineData(GBaseParser.RoutineDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineSecurity(GBaseParser.RoutineSecurityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link GBaseParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineSecurity(GBaseParser.RoutineSecurityContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void enterServerOption(GBaseParser.ServerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void exitServerOption(GBaseParser.ServerOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitions(GBaseParser.CreateDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitions(GBaseParser.CreateDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link GBaseParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDeclaration(GBaseParser.ColumnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link GBaseParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDeclaration(GBaseParser.ColumnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link GBaseParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclaration(GBaseParser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link GBaseParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclaration(GBaseParser.ConstraintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link GBaseParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIndexDeclaration(GBaseParser.IndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link GBaseParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIndexDeclaration(GBaseParser.IndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(GBaseParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(GBaseParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNullColumnConstraint(GBaseParser.NullColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNullColumnConstraint(GBaseParser.NullColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDefaultColumnConstraint(GBaseParser.DefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDefaultColumnConstraint(GBaseParser.DefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrementColumnConstraint(GBaseParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrementColumnConstraint(GBaseParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumnConstraint(GBaseParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumnConstraint(GBaseParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyColumnConstraint(GBaseParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyColumnConstraint(GBaseParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCommentColumnConstraint(GBaseParser.CommentColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCommentColumnConstraint(GBaseParser.CommentColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterFormatColumnConstraint(GBaseParser.FormatColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitFormatColumnConstraint(GBaseParser.FormatColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterStorageColumnConstraint(GBaseParser.StorageColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitStorageColumnConstraint(GBaseParser.StorageColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterReferenceColumnConstraint(GBaseParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitReferenceColumnConstraint(GBaseParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCollateColumnConstraint(GBaseParser.CollateColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCollateColumnConstraint(GBaseParser.CollateColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnConstraint(GBaseParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnConstraint(GBaseParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSerialDefaultColumnConstraint(GBaseParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link GBaseParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSerialDefaultColumnConstraint(GBaseParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link GBaseParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyTableConstraint(GBaseParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link GBaseParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyTableConstraint(GBaseParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link GBaseParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyTableConstraint(GBaseParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link GBaseParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyTableConstraint(GBaseParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link GBaseParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyTableConstraint(GBaseParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link GBaseParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyTableConstraint(GBaseParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link GBaseParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableConstraint(GBaseParser.CheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link GBaseParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableConstraint(GBaseParser.CheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(GBaseParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(GBaseParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void enterReferenceAction(GBaseParser.ReferenceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void exitReferenceAction(GBaseParser.ReferenceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceControlType(GBaseParser.ReferenceControlTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceControlType(GBaseParser.ReferenceControlTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link GBaseParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIndexDeclaration(GBaseParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link GBaseParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIndexDeclaration(GBaseParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link GBaseParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSpecialIndexDeclaration(GBaseParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link GBaseParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSpecialIndexDeclaration(GBaseParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEngine(GBaseParser.TableOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEngine(GBaseParser.TableOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAutoIncrement(GBaseParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAutoIncrement(GBaseParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAverage(GBaseParser.TableOptionAverageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAverage(GBaseParser.TableOptionAverageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCharset(GBaseParser.TableOptionCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCharset(GBaseParser.TableOptionCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionChecksum(GBaseParser.TableOptionChecksumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionChecksum(GBaseParser.TableOptionChecksumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCollate(GBaseParser.TableOptionCollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCollate(GBaseParser.TableOptionCollateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionComment(GBaseParser.TableOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionComment(GBaseParser.TableOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCompression(GBaseParser.TableOptionCompressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCompression(GBaseParser.TableOptionCompressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionConnection(GBaseParser.TableOptionConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionConnection(GBaseParser.TableOptionConnectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDataDirectory(GBaseParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDataDirectory(GBaseParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDelay(GBaseParser.TableOptionDelayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDelay(GBaseParser.TableOptionDelayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEncryption(GBaseParser.TableOptionEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEncryption(GBaseParser.TableOptionEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionIndexDirectory(GBaseParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionIndexDirectory(GBaseParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionInsertMethod(GBaseParser.TableOptionInsertMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionInsertMethod(GBaseParser.TableOptionInsertMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionKeyBlockSize(GBaseParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionKeyBlockSize(GBaseParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMaxRows(GBaseParser.TableOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMaxRows(GBaseParser.TableOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMinRows(GBaseParser.TableOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMinRows(GBaseParser.TableOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPackKeys(GBaseParser.TableOptionPackKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPackKeys(GBaseParser.TableOptionPackKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPassword(GBaseParser.TableOptionPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPassword(GBaseParser.TableOptionPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRowFormat(GBaseParser.TableOptionRowFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRowFormat(GBaseParser.TableOptionRowFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRecalculation(GBaseParser.TableOptionRecalculationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRecalculation(GBaseParser.TableOptionRecalculationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPersistent(GBaseParser.TableOptionPersistentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPersistent(GBaseParser.TableOptionPersistentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionSamplePage(GBaseParser.TableOptionSamplePageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionSamplePage(GBaseParser.TableOptionSamplePageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionTablespace(GBaseParser.TableOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionTablespace(GBaseParser.TableOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionUnion(GBaseParser.TableOptionUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link GBaseParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionUnion(GBaseParser.TableOptionUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceStorage(GBaseParser.TablespaceStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceStorage(GBaseParser.TablespaceStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions(GBaseParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions(GBaseParser.PartitionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link GBaseParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionHash(GBaseParser.PartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link GBaseParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionHash(GBaseParser.PartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link GBaseParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionKey(GBaseParser.PartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link GBaseParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionKey(GBaseParser.PartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link GBaseParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionRange(GBaseParser.PartitionFunctionRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link GBaseParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionRange(GBaseParser.PartitionFunctionRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link GBaseParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionList(GBaseParser.PartitionFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link GBaseParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionList(GBaseParser.PartitionFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link GBaseParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionHash(GBaseParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link GBaseParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionHash(GBaseParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link GBaseParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionKey(GBaseParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link GBaseParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionKey(GBaseParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link GBaseParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionComparision(GBaseParser.PartitionComparisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link GBaseParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionComparision(GBaseParser.PartitionComparisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link GBaseParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListAtom(GBaseParser.PartitionListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link GBaseParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListAtom(GBaseParser.PartitionListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link GBaseParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListVector(GBaseParser.PartitionListVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link GBaseParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListVector(GBaseParser.PartitionListVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link GBaseParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSimple(GBaseParser.PartitionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link GBaseParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSimple(GBaseParser.PartitionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerAtom(GBaseParser.PartitionDefinerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerAtom(GBaseParser.PartitionDefinerAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerVector(GBaseParser.PartitionDefinerVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerVector(GBaseParser.PartitionDefinerVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition(GBaseParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition(GBaseParser.SubpartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionEngine(GBaseParser.PartitionOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionEngine(GBaseParser.PartitionOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionComment(GBaseParser.PartitionOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionComment(GBaseParser.PartitionOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionDataDirectory(GBaseParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionDataDirectory(GBaseParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionIndexDirectory(GBaseParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionIndexDirectory(GBaseParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMaxRows(GBaseParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMaxRows(GBaseParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMinRows(GBaseParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMinRows(GBaseParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionTablespace(GBaseParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionTablespace(GBaseParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionNodeGroup(GBaseParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link GBaseParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionNodeGroup(GBaseParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link GBaseParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterSimpleDatabase(GBaseParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link GBaseParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterSimpleDatabase(GBaseParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link GBaseParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterUpgradeName(GBaseParser.AlterUpgradeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link GBaseParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterUpgradeName(GBaseParser.AlterUpgradeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void enterAlterEvent(GBaseParser.AlterEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void exitAlterEvent(GBaseParser.AlterEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(GBaseParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(GBaseParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void enterAlterInstance(GBaseParser.AlterInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void exitAlterInstance(GBaseParser.AlterInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogfileGroup(GBaseParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogfileGroup(GBaseParser.AlterLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(GBaseParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(GBaseParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(GBaseParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(GBaseParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(GBaseParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(GBaseParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(GBaseParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(GBaseParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(GBaseParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(GBaseParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTableOption(GBaseParser.AlterByTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTableOption(GBaseParser.AlterByTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumn(GBaseParser.AlterByAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumn(GBaseParser.AlterByAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumns(GBaseParser.AlterByAddColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumns(GBaseParser.AlterByAddColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddIndex(GBaseParser.AlterByAddIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddIndex(GBaseParser.AlterByAddIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPrimaryKey(GBaseParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPrimaryKey(GBaseParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddUniqueKey(GBaseParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddUniqueKey(GBaseParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddSpecialIndex(GBaseParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddSpecialIndex(GBaseParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddForeignKey(GBaseParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddForeignKey(GBaseParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddCheckTableConstraint(GBaseParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddCheckTableConstraint(GBaseParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterBySetAlgorithm(GBaseParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterBySetAlgorithm(GBaseParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeDefault(GBaseParser.AlterByChangeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeDefault(GBaseParser.AlterByChangeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeColumn(GBaseParser.AlterByChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeColumn(GBaseParser.AlterByChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRenameColumn(GBaseParser.AlterByRenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRenameColumn(GBaseParser.AlterByRenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByLock(GBaseParser.AlterByLockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByLock(GBaseParser.AlterByLockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByModifyColumn(GBaseParser.AlterByModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByModifyColumn(GBaseParser.AlterByModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropColumn(GBaseParser.AlterByDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropColumn(GBaseParser.AlterByDropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPrimaryKey(GBaseParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPrimaryKey(GBaseParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRenameIndex(GBaseParser.AlterByRenameIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRenameIndex(GBaseParser.AlterByRenameIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropIndex(GBaseParser.AlterByDropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropIndex(GBaseParser.AlterByDropIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropForeignKey(GBaseParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropForeignKey(GBaseParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDisableKeys(GBaseParser.AlterByDisableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDisableKeys(GBaseParser.AlterByDisableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByEnableKeys(GBaseParser.AlterByEnableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByEnableKeys(GBaseParser.AlterByEnableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRename(GBaseParser.AlterByRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRename(GBaseParser.AlterByRenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOrder(GBaseParser.AlterByOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOrder(GBaseParser.AlterByOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByConvertCharset(GBaseParser.AlterByConvertCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByConvertCharset(GBaseParser.AlterByConvertCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDefaultCharset(GBaseParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDefaultCharset(GBaseParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardTablespace(GBaseParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardTablespace(GBaseParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportTablespace(GBaseParser.AlterByImportTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportTablespace(GBaseParser.AlterByImportTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByForce(GBaseParser.AlterByForceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByForce(GBaseParser.AlterByForceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByValidate(GBaseParser.AlterByValidateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByValidate(GBaseParser.AlterByValidateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPartition(GBaseParser.AlterByAddPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPartition(GBaseParser.AlterByAddPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPartition(GBaseParser.AlterByDropPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPartition(GBaseParser.AlterByDropPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardPartition(GBaseParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardPartition(GBaseParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportPartition(GBaseParser.AlterByImportPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportPartition(GBaseParser.AlterByImportPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTruncatePartition(GBaseParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTruncatePartition(GBaseParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCoalescePartition(GBaseParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCoalescePartition(GBaseParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByReorganizePartition(GBaseParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByReorganizePartition(GBaseParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByExchangePartition(GBaseParser.AlterByExchangePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByExchangePartition(GBaseParser.AlterByExchangePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAnalyzePartition(GBaseParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAnalyzePartition(GBaseParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCheckPartition(GBaseParser.AlterByCheckPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCheckPartition(GBaseParser.AlterByCheckPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOptimizePartition(GBaseParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOptimizePartition(GBaseParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRebuildPartition(GBaseParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRebuildPartition(GBaseParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRepairPartition(GBaseParser.AlterByRepairPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRepairPartition(GBaseParser.AlterByRepairPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRemovePartitioning(GBaseParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRemovePartitioning(GBaseParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByUpgradePartitioning(GBaseParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link GBaseParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByUpgradePartitioning(GBaseParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(GBaseParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(GBaseParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void enterDropEvent(GBaseParser.DropEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void exitDropEvent(GBaseParser.DropEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(GBaseParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(GBaseParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropLogfileGroup(GBaseParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropLogfileGroup(GBaseParser.DropLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(GBaseParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(GBaseParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(GBaseParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(GBaseParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(GBaseParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(GBaseParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(GBaseParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(GBaseParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(GBaseParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(GBaseParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(GBaseParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(GBaseParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(GBaseParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(GBaseParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(GBaseParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(GBaseParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableClause(GBaseParser.RenameTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableClause(GBaseParser.RenameTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(GBaseParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(GBaseParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(GBaseParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(GBaseParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(GBaseParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(GBaseParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(GBaseParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(GBaseParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(GBaseParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(GBaseParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(GBaseParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(GBaseParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(GBaseParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(GBaseParser.LoadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(GBaseParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(GBaseParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceStatement(GBaseParser.ReplaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceStatement(GBaseParser.ReplaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link GBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(GBaseParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link GBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(GBaseParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link GBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSelect(GBaseParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link GBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSelect(GBaseParser.ParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link GBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelect(GBaseParser.UnionSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link GBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelect(GBaseParser.UnionSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link GBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesisSelect(GBaseParser.UnionParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link GBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesisSelect(GBaseParser.UnionParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(GBaseParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(GBaseParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatementValue(GBaseParser.InsertStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatementValue(GBaseParser.InsertStatementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void enterUpdatedElement(GBaseParser.UpdatedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void exitUpdatedElement(GBaseParser.UpdatedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentField(GBaseParser.AssignmentFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentField(GBaseParser.AssignmentFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(GBaseParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(GBaseParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeleteStatement(GBaseParser.SingleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeleteStatement(GBaseParser.SingleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleDeleteStatement(GBaseParser.MultipleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleDeleteStatement(GBaseParser.MultipleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(GBaseParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(GBaseParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(GBaseParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(GBaseParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(GBaseParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(GBaseParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(GBaseParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(GBaseParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleUpdateStatement(GBaseParser.SingleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleUpdateStatement(GBaseParser.SingleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleUpdateStatement(GBaseParser.MultipleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleUpdateStatement(GBaseParser.MultipleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(GBaseParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(GBaseParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(GBaseParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(GBaseParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(GBaseParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(GBaseParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link GBaseParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(GBaseParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link GBaseParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(GBaseParser.TableSourceBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link GBaseParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNested(GBaseParser.TableSourceNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link GBaseParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNested(GBaseParser.TableSourceNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link GBaseParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterAtomTableItem(GBaseParser.AtomTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link GBaseParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitAtomTableItem(GBaseParser.AtomTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link GBaseParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryTableItem(GBaseParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link GBaseParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryTableItem(GBaseParser.SubqueryTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link GBaseParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterTableSourcesItem(GBaseParser.TableSourcesItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link GBaseParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitTableSourcesItem(GBaseParser.TableSourcesItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(GBaseParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(GBaseParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintType(GBaseParser.IndexHintTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintType(GBaseParser.IndexHintTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link GBaseParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(GBaseParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link GBaseParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(GBaseParser.InnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link GBaseParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterStraightJoin(GBaseParser.StraightJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link GBaseParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitStraightJoin(GBaseParser.StraightJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link GBaseParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoin(GBaseParser.OuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link GBaseParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoin(GBaseParser.OuterJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link GBaseParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(GBaseParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link GBaseParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(GBaseParser.NaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(GBaseParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(GBaseParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionNointo(GBaseParser.QueryExpressionNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionNointo(GBaseParser.QueryExpressionNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(GBaseParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(GBaseParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecificationNointo(GBaseParser.QuerySpecificationNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesis(GBaseParser.UnionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesis(GBaseParser.UnionParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionStatement(GBaseParser.UnionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionStatement(GBaseParser.UnionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(GBaseParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(GBaseParser.SelectSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(GBaseParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(GBaseParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link GBaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStarElement(GBaseParser.SelectStarElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link GBaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStarElement(GBaseParser.SelectStarElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link GBaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(GBaseParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link GBaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(GBaseParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link GBaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(GBaseParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link GBaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(GBaseParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link GBaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpressionElement(GBaseParser.SelectExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link GBaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpressionElement(GBaseParser.SelectExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link GBaseParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoVariables(GBaseParser.SelectIntoVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link GBaseParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoVariables(GBaseParser.SelectIntoVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link GBaseParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoDumpFile(GBaseParser.SelectIntoDumpFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link GBaseParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoDumpFile(GBaseParser.SelectIntoDumpFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link GBaseParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoTextFile(GBaseParser.SelectIntoTextFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link GBaseParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoTextFile(GBaseParser.SelectIntoTextFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(GBaseParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(GBaseParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(GBaseParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(GBaseParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(GBaseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(GBaseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(GBaseParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(GBaseParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(GBaseParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(GBaseParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseAtom(GBaseParser.LimitClauseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseAtom(GBaseParser.LimitClauseAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(GBaseParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(GBaseParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void enterBeginWork(GBaseParser.BeginWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void exitBeginWork(GBaseParser.BeginWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void enterCommitWork(GBaseParser.CommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void exitCommitWork(GBaseParser.CommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterRollbackWork(GBaseParser.RollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitRollbackWork(GBaseParser.RollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void enterSavepointStatement(GBaseParser.SavepointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void exitSavepointStatement(GBaseParser.SavepointStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void enterRollbackStatement(GBaseParser.RollbackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void exitRollbackStatement(GBaseParser.RollbackStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseStatement(GBaseParser.ReleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseStatement(GBaseParser.ReleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void enterLockTables(GBaseParser.LockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void exitLockTables(GBaseParser.LockTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void enterUnlockTables(GBaseParser.UnlockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void exitUnlockTables(GBaseParser.UnlockTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommitStatement(GBaseParser.SetAutocommitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommitStatement(GBaseParser.SetAutocommitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransactionStatement(GBaseParser.SetTransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransactionStatement(GBaseParser.SetTransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionMode(GBaseParser.TransactionModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionMode(GBaseParser.TransactionModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void enterLockTableElement(GBaseParser.LockTableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void exitLockTableElement(GBaseParser.LockTableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void enterLockAction(GBaseParser.LockActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void exitLockAction(GBaseParser.LockActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void enterTransactionOption(GBaseParser.TransactionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void exitTransactionOption(GBaseParser.TransactionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevel(GBaseParser.TransactionLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevel(GBaseParser.TransactionLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void enterChangeMaster(GBaseParser.ChangeMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void exitChangeMaster(GBaseParser.ChangeMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationFilter(GBaseParser.ChangeReplicationFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationFilter(GBaseParser.ChangeReplicationFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterPurgeBinaryLogs(GBaseParser.PurgeBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitPurgeBinaryLogs(GBaseParser.PurgeBinaryLogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void enterResetMaster(GBaseParser.ResetMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void exitResetMaster(GBaseParser.ResetMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void enterResetSlave(GBaseParser.ResetSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void exitResetSlave(GBaseParser.ResetSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void enterStartSlave(GBaseParser.StartSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void exitStartSlave(GBaseParser.StartSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void enterStopSlave(GBaseParser.StopSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void exitStopSlave(GBaseParser.StopSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStartGroupReplication(GBaseParser.StartGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStartGroupReplication(GBaseParser.StartGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStopGroupReplication(GBaseParser.StopGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStopGroupReplication(GBaseParser.StopGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterStringOption(GBaseParser.MasterStringOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterStringOption(GBaseParser.MasterStringOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterDecimalOption(GBaseParser.MasterDecimalOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterDecimalOption(GBaseParser.MasterDecimalOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterBoolOption(GBaseParser.MasterBoolOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterBoolOption(GBaseParser.MasterBoolOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterRealOption(GBaseParser.MasterRealOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterRealOption(GBaseParser.MasterRealOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterUidListOption(GBaseParser.MasterUidListOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link GBaseParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterUidListOption(GBaseParser.MasterUidListOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterStringMasterOption(GBaseParser.StringMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitStringMasterOption(GBaseParser.StringMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterDecimalMasterOption(GBaseParser.DecimalMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitDecimalMasterOption(GBaseParser.DecimalMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterBoolMasterOption(GBaseParser.BoolMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitBoolMasterOption(GBaseParser.BoolMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(GBaseParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(GBaseParser.ChannelOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoDbReplication(GBaseParser.DoDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoDbReplication(GBaseParser.DoDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreDbReplication(GBaseParser.IgnoreDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreDbReplication(GBaseParser.IgnoreDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoTableReplication(GBaseParser.DoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoTableReplication(GBaseParser.DoTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreTableReplication(GBaseParser.IgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreTableReplication(GBaseParser.IgnoreTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildDoTableReplication(GBaseParser.WildDoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildDoTableReplication(GBaseParser.WildDoTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildIgnoreTableReplication(GBaseParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildIgnoreTableReplication(GBaseParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterRewriteDbReplication(GBaseParser.RewriteDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link GBaseParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitRewriteDbReplication(GBaseParser.RewriteDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void enterTablePair(GBaseParser.TablePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void exitTablePair(GBaseParser.TablePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#threadType}.
	 * @param ctx the parse tree
	 */
	void enterThreadType(GBaseParser.ThreadTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#threadType}.
	 * @param ctx the parse tree
	 */
	void exitThreadType(GBaseParser.ThreadTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link GBaseParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterGtidsUntilOption(GBaseParser.GtidsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link GBaseParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitGtidsUntilOption(GBaseParser.GtidsUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link GBaseParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterLogUntilOption(GBaseParser.MasterLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link GBaseParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterLogUntilOption(GBaseParser.MasterLogUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link GBaseParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterRelayLogUntilOption(GBaseParser.RelayLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link GBaseParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitRelayLogUntilOption(GBaseParser.RelayLogUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link GBaseParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterSqlGapsUntilOption(GBaseParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link GBaseParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitSqlGapsUntilOption(GBaseParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link GBaseParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterUserConnectionOption(GBaseParser.UserConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link GBaseParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitUserConnectionOption(GBaseParser.UserConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link GBaseParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordConnectionOption(GBaseParser.PasswordConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link GBaseParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordConnectionOption(GBaseParser.PasswordConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link GBaseParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultAuthConnectionOption(GBaseParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link GBaseParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultAuthConnectionOption(GBaseParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link GBaseParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPluginDirConnectionOption(GBaseParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link GBaseParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPluginDirConnectionOption(GBaseParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void enterGtuidSet(GBaseParser.GtuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void exitGtuidSet(GBaseParser.GtuidSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaStartTransaction(GBaseParser.XaStartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaStartTransaction(GBaseParser.XaStartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaEndTransaction(GBaseParser.XaEndTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaEndTransaction(GBaseParser.XaEndTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterXaPrepareStatement(GBaseParser.XaPrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitXaPrepareStatement(GBaseParser.XaPrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void enterXaCommitWork(GBaseParser.XaCommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void exitXaCommitWork(GBaseParser.XaCommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRollbackWork(GBaseParser.XaRollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRollbackWork(GBaseParser.XaRollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRecoverWork(GBaseParser.XaRecoverWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRecoverWork(GBaseParser.XaRecoverWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrepareStatement(GBaseParser.PrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrepareStatement(GBaseParser.PrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(GBaseParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(GBaseParser.ExecuteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void enterDeallocatePrepare(GBaseParser.DeallocatePrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void exitDeallocatePrepare(GBaseParser.DeallocatePrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(GBaseParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(GBaseParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GBaseParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GBaseParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(GBaseParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(GBaseParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GBaseParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GBaseParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(GBaseParser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(GBaseParser.IterateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(GBaseParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(GBaseParser.LeaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(GBaseParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(GBaseParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(GBaseParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(GBaseParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GBaseParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GBaseParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GBaseParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GBaseParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link GBaseParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseCursor(GBaseParser.CloseCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link GBaseParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseCursor(GBaseParser.CloseCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link GBaseParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchCursor(GBaseParser.FetchCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link GBaseParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchCursor(GBaseParser.FetchCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link GBaseParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenCursor(GBaseParser.OpenCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link GBaseParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenCursor(GBaseParser.OpenCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(GBaseParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(GBaseParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCondition(GBaseParser.DeclareConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCondition(GBaseParser.DeclareConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursor(GBaseParser.DeclareCursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursor(GBaseParser.DeclareCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void enterDeclareHandler(GBaseParser.DeclareHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void exitDeclareHandler(GBaseParser.DeclareHandlerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionCode(GBaseParser.HandlerConditionCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionCode(GBaseParser.HandlerConditionCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionState(GBaseParser.HandlerConditionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionState(GBaseParser.HandlerConditionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionName(GBaseParser.HandlerConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionName(GBaseParser.HandlerConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionWarning(GBaseParser.HandlerConditionWarningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionWarning(GBaseParser.HandlerConditionWarningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionNotfound(GBaseParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionNotfound(GBaseParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionException(GBaseParser.HandlerConditionExceptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link GBaseParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionException(GBaseParser.HandlerConditionExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSqlStatement(GBaseParser.ProcedureSqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSqlStatement(GBaseParser.ProcedureSqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseAlternative(GBaseParser.CaseAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseAlternative(GBaseParser.CaseAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void enterElifAlternative(GBaseParser.ElifAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void exitElifAlternative(GBaseParser.ElifAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link GBaseParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV56(GBaseParser.AlterUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link GBaseParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV56(GBaseParser.AlterUserMysqlV56Context ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link GBaseParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV57(GBaseParser.AlterUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link GBaseParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV57(GBaseParser.AlterUserMysqlV57Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link GBaseParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV56(GBaseParser.CreateUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link GBaseParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV56(GBaseParser.CreateUserMysqlV56Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link GBaseParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV57(GBaseParser.CreateUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link GBaseParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV57(GBaseParser.CreateUserMysqlV57Context ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(GBaseParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(GBaseParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantStatement(GBaseParser.GrantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantStatement(GBaseParser.GrantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void enterGrantProxy(GBaseParser.GrantProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void exitGrantProxy(GBaseParser.GrantProxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void enterRenameUser(GBaseParser.RenameUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void exitRenameUser(GBaseParser.RenameUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link GBaseParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDetailRevoke(GBaseParser.DetailRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link GBaseParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDetailRevoke(GBaseParser.DetailRevokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link GBaseParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterShortRevoke(GBaseParser.ShortRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link GBaseParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitShortRevoke(GBaseParser.ShortRevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void enterRevokeProxy(GBaseParser.RevokeProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void exitRevokeProxy(GBaseParser.RevokeProxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPasswordStatement(GBaseParser.SetPasswordStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPasswordStatement(GBaseParser.SetPasswordStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void enterUserSpecification(GBaseParser.UserSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void exitUserSpecification(GBaseParser.UserSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link GBaseParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordAuthOption(GBaseParser.PasswordAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link GBaseParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordAuthOption(GBaseParser.PasswordAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link GBaseParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterStringAuthOption(GBaseParser.StringAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link GBaseParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitStringAuthOption(GBaseParser.StringAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link GBaseParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterHashAuthOption(GBaseParser.HashAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link GBaseParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitHashAuthOption(GBaseParser.HashAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link GBaseParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAuthOption(GBaseParser.SimpleAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link GBaseParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAuthOption(GBaseParser.SimpleAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void enterTlsOption(GBaseParser.TlsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void exitTlsOption(GBaseParser.TlsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void enterUserResourceOption(GBaseParser.UserResourceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void exitUserResourceOption(GBaseParser.UserResourceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void enterUserPasswordOption(GBaseParser.UserPasswordOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void exitUserPasswordOption(GBaseParser.UserPasswordOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void enterUserLockOption(GBaseParser.UserLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void exitUserLockOption(GBaseParser.UserLockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivelegeClause(GBaseParser.PrivelegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivelegeClause(GBaseParser.PrivelegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(GBaseParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(GBaseParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterCurrentSchemaPriviLevel(GBaseParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitCurrentSchemaPriviLevel(GBaseParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterGlobalPrivLevel(GBaseParser.GlobalPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitGlobalPrivLevel(GBaseParser.GlobalPrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteSchemaPrivLevel(GBaseParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteSchemaPrivLevel(GBaseParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteFullTablePrivLevel(GBaseParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteFullTablePrivLevel(GBaseParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteFullTablePrivLevel2}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteFullTablePrivLevel2(GBaseParser.DefiniteFullTablePrivLevel2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteFullTablePrivLevel2}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteFullTablePrivLevel2(GBaseParser.DefiniteFullTablePrivLevel2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteTablePrivLevel(GBaseParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link GBaseParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteTablePrivLevel(GBaseParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameUserClause(GBaseParser.RenameUserClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameUserClause(GBaseParser.RenameUserClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(GBaseParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(GBaseParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(GBaseParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(GBaseParser.CheckTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(GBaseParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(GBaseParser.ChecksumTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(GBaseParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(GBaseParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(GBaseParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(GBaseParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption(GBaseParser.CheckTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption(GBaseParser.CheckTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateUdfunction(GBaseParser.CreateUdfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateUdfunction(GBaseParser.CreateUdfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(GBaseParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(GBaseParser.InstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(GBaseParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(GBaseParser.UninstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(GBaseParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(GBaseParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetCharset(GBaseParser.SetCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetCharset(GBaseParser.SetCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNames(GBaseParser.SetNamesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNames(GBaseParser.SetNamesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(GBaseParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(GBaseParser.SetPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(GBaseParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(GBaseParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommit(GBaseParser.SetAutocommitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommit(GBaseParser.SetAutocommitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNewValueInsideTrigger}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNewValueInsideTrigger(GBaseParser.SetNewValueInsideTriggerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNewValueInsideTrigger}
	 * labeled alternative in {@link GBaseParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNewValueInsideTrigger(GBaseParser.SetNewValueInsideTriggerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterLogs(GBaseParser.ShowMasterLogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterLogs(GBaseParser.ShowMasterLogsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowLogEvents(GBaseParser.ShowLogEventsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowLogEvents(GBaseParser.ShowLogEventsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowObjectFilter(GBaseParser.ShowObjectFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowObjectFilter(GBaseParser.ShowObjectFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(GBaseParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(GBaseParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDb(GBaseParser.ShowCreateDbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDb(GBaseParser.ShowCreateDbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFullIdObject(GBaseParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFullIdObject(GBaseParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(GBaseParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(GBaseParser.ShowCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(GBaseParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(GBaseParser.ShowEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfo(GBaseParser.ShowGlobalInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfo(GBaseParser.ShowGlobalInfoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(GBaseParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(GBaseParser.ShowErrorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCountErrors(GBaseParser.ShowCountErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCountErrors(GBaseParser.ShowCountErrorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaFilter(GBaseParser.ShowSchemaFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaFilter(GBaseParser.ShowSchemaFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowRoutine(GBaseParser.ShowRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowRoutine(GBaseParser.ShowRoutineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(GBaseParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(GBaseParser.ShowGrantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowIndexes(GBaseParser.ShowIndexesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowIndexes(GBaseParser.ShowIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(GBaseParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(GBaseParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(GBaseParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(GBaseParser.ShowProfileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(GBaseParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link GBaseParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(GBaseParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void enterVariableClause(GBaseParser.VariableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void exitVariableClause(GBaseParser.VariableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowCommonEntity(GBaseParser.ShowCommonEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowCommonEntity(GBaseParser.ShowCommonEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(GBaseParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(GBaseParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfoClause(GBaseParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfoClause(GBaseParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaEntity(GBaseParser.ShowSchemaEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaEntity(GBaseParser.ShowSchemaEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(GBaseParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(GBaseParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void enterBinlogStatement(GBaseParser.BinlogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void exitBinlogStatement(GBaseParser.BinlogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndexStatement(GBaseParser.CacheIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndexStatement(GBaseParser.CacheIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlushStatement(GBaseParser.FlushStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlushStatement(GBaseParser.FlushStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void enterKillStatement(GBaseParser.KillStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void exitKillStatement(GBaseParser.KillStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexIntoCache(GBaseParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexIntoCache(GBaseParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(GBaseParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(GBaseParser.ResetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void enterShutdownStatement(GBaseParser.ShutdownStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void exitShutdownStatement(GBaseParser.ShutdownStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexes(GBaseParser.TableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexes(GBaseParser.TableIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link GBaseParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFlushOption(GBaseParser.SimpleFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link GBaseParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFlushOption(GBaseParser.SimpleFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link GBaseParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelFlushOption(GBaseParser.ChannelFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link GBaseParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelFlushOption(GBaseParser.ChannelFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link GBaseParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterTableFlushOption(GBaseParser.TableFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link GBaseParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitTableFlushOption(GBaseParser.TableFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void enterFlushTableOption(GBaseParser.FlushTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void exitFlushTableOption(GBaseParser.FlushTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterLoadedTableIndexes(GBaseParser.LoadedTableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitLoadedTableIndexes(GBaseParser.LoadedTableIndexesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDescribeStatement(GBaseParser.SimpleDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDescribeStatement(GBaseParser.SimpleDescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterFullDescribeStatement(GBaseParser.FullDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitFullDescribeStatement(GBaseParser.FullDescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void enterHelpStatement(GBaseParser.HelpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void exitHelpStatement(GBaseParser.HelpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(GBaseParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(GBaseParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalStatement(GBaseParser.SignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalStatement(GBaseParser.SignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void enterResignalStatement(GBaseParser.ResignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void exitResignalStatement(GBaseParser.ResignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#signalConditionInformation}.
	 * @param ctx the parse tree
	 */
	void enterSignalConditionInformation(GBaseParser.SignalConditionInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#signalConditionInformation}.
	 * @param ctx the parse tree
	 */
	void exitSignalConditionInformation(GBaseParser.SignalConditionInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#diagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsStatement(GBaseParser.DiagnosticsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#diagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsStatement(GBaseParser.DiagnosticsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#diagnosticsConditionInformationName}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsConditionInformationName(GBaseParser.DiagnosticsConditionInformationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#diagnosticsConditionInformationName}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsConditionInformationName(GBaseParser.DiagnosticsConditionInformationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link GBaseParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStatements(GBaseParser.DescribeStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link GBaseParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStatements(GBaseParser.DescribeStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link GBaseParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeConnection(GBaseParser.DescribeConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link GBaseParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeConnection(GBaseParser.DescribeConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(GBaseParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(GBaseParser.FullIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(GBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(GBaseParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(GBaseParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(GBaseParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnName(GBaseParser.IndexColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnName(GBaseParser.IndexColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(GBaseParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(GBaseParser.UserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariable(GBaseParser.MysqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariable(GBaseParser.MysqlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(GBaseParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(GBaseParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(GBaseParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(GBaseParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(GBaseParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(GBaseParser.EngineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void enterUuidSet(GBaseParser.UuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void exitUuidSet(GBaseParser.UuidSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#xid}.
	 * @param ctx the parse tree
	 */
	void enterXid(GBaseParser.XidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#xid}.
	 * @param ctx the parse tree
	 */
	void exitXid(GBaseParser.XidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void enterXuidStringId(GBaseParser.XuidStringIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void exitXuidStringId(GBaseParser.XuidStringIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void enterAuthPlugin(GBaseParser.AuthPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void exitAuthPlugin(GBaseParser.AuthPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(GBaseParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(GBaseParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleId(GBaseParser.SimpleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleId(GBaseParser.SimpleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void enterDottedId(GBaseParser.DottedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void exitDottedId(GBaseParser.DottedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(GBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(GBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(GBaseParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(GBaseParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(GBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(GBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(GBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(GBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(GBaseParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(GBaseParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(GBaseParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(GBaseParser.NullNotnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(GBaseParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(GBaseParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(GBaseParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(GBaseParser.StringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNationalStringDataType(GBaseParser.NationalStringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNationalStringDataType(GBaseParser.NationalStringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNationalVaryingStringDataType(GBaseParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNationalVaryingStringDataType(GBaseParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionDataType(GBaseParser.DimensionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionDataType(GBaseParser.DimensionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDataType(GBaseParser.SimpleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDataType(GBaseParser.SimpleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionDataType(GBaseParser.CollectionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionDataType(GBaseParser.CollectionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSpatialDataType(GBaseParser.SpatialDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link GBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSpatialDataType(GBaseParser.SpatialDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void enterCollectionOptions(GBaseParser.CollectionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void exitCollectionOptions(GBaseParser.CollectionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void enterConvertedDataType(GBaseParser.ConvertedDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void exitConvertedDataType(GBaseParser.ConvertedDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(GBaseParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(GBaseParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoDimension(GBaseParser.LengthTwoDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoDimension(GBaseParser.LengthTwoDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoOptionalDimension(GBaseParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoOptionalDimension(GBaseParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#uidList}.
	 * @param ctx the parse tree
	 */
	void enterUidList(GBaseParser.UidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#uidList}.
	 * @param ctx the parse tree
	 */
	void exitUidList(GBaseParser.UidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(GBaseParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(GBaseParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnNames(GBaseParser.IndexColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnNames(GBaseParser.IndexColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(GBaseParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(GBaseParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsWithDefaults(GBaseParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsWithDefaults(GBaseParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(GBaseParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(GBaseParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStrings(GBaseParser.SimpleStringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStrings(GBaseParser.SimpleStringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void enterUserVariables(GBaseParser.UserVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void exitUserVariables(GBaseParser.UserVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(GBaseParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(GBaseParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterCurrentTimestamp(GBaseParser.CurrentTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitCurrentTimestamp(GBaseParser.CurrentTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrDefault(GBaseParser.ExpressionOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrDefault(GBaseParser.ExpressionOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(GBaseParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(GBaseParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(GBaseParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(GBaseParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(GBaseParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(GBaseParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(GBaseParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(GBaseParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionCall(GBaseParser.ScalarFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionCall(GBaseParser.ScalarFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunctionCall(GBaseParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunctionCall(GBaseParser.UdfFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionCall(GBaseParser.PasswordFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionCall(GBaseParser.PasswordFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code olapFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterOlapFunctionCall(GBaseParser.OlapFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code olapFunctionCall}
	 * labeled alternative in {@link GBaseParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitOlapFunctionCall(GBaseParser.OlapFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(GBaseParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(GBaseParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeFunctionCall(GBaseParser.DataTypeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeFunctionCall(GBaseParser.DataTypeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunctionCall(GBaseParser.ValuesFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunctionCall(GBaseParser.ValuesFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseFunctionCall(GBaseParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseFunctionCall(GBaseParser.CaseFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionCall(GBaseParser.CharFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionCall(GBaseParser.CharFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunctionCall(GBaseParser.PositionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunctionCall(GBaseParser.PositionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(GBaseParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(GBaseParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunctionCall(GBaseParser.TrimFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunctionCall(GBaseParser.TrimFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightFunctionCall(GBaseParser.WeightFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightFunctionCall(GBaseParser.WeightFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunctionCall(GBaseParser.ExtractFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunctionCall(GBaseParser.ExtractFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetFormatFunctionCall(GBaseParser.GetFormatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link GBaseParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetFormatFunctionCall(GBaseParser.GetFormatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseFuncAlternative(GBaseParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseFuncAlternative(GBaseParser.CaseFuncAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link GBaseParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightList(GBaseParser.LevelWeightListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link GBaseParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightList(GBaseParser.LevelWeightListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link GBaseParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightRange(GBaseParser.LevelWeightRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link GBaseParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightRange(GBaseParser.LevelWeightRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(GBaseParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(GBaseParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(GBaseParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(GBaseParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#olapFunction}.
	 * @param ctx the parse tree
	 */
	void enterOlapFunction(GBaseParser.OlapFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#olapFunction}.
	 * @param ctx the parse tree
	 */
	void exitOlapFunction(GBaseParser.OlapFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionName(GBaseParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionName(GBaseParser.ScalarFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionClause(GBaseParser.PasswordFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionClause(GBaseParser.PasswordFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(GBaseParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(GBaseParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(GBaseParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(GBaseParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link GBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(GBaseParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link GBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(GBaseParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link GBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(GBaseParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link GBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(GBaseParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link GBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(GBaseParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link GBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(GBaseParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link GBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(GBaseParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link GBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(GBaseParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSoundsLikePredicate(GBaseParser.SoundsLikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSoundsLikePredicate(GBaseParser.SoundsLikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(GBaseParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(GBaseParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(GBaseParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(GBaseParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryComparasionPredicate(GBaseParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryComparasionPredicate(GBaseParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(GBaseParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(GBaseParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparasionPredicate(GBaseParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparasionPredicate(GBaseParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(GBaseParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(GBaseParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(GBaseParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(GBaseParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRegexpPredicate(GBaseParser.RegexpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link GBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRegexpPredicate(GBaseParser.RegexpPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(GBaseParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(GBaseParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterCollateExpressionAtom(GBaseParser.CollateExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitCollateExpressionAtom(GBaseParser.CollateExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpessionAtom(GBaseParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpessionAtom(GBaseParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariableExpressionAtom(GBaseParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariableExpressionAtom(GBaseParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(GBaseParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(GBaseParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedRowExpressionAtom(GBaseParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedRowExpressionAtom(GBaseParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(GBaseParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(GBaseParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpressionAtom(GBaseParser.IntervalExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpressionAtom(GBaseParser.IntervalExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpessionAtom(GBaseParser.ExistsExpessionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpessionAtom(GBaseParser.ExistsExpessionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(GBaseParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(GBaseParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAtom(GBaseParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAtom(GBaseParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionAtom(GBaseParser.BinaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionAtom(GBaseParser.BinaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(GBaseParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(GBaseParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBitExpressionAtom(GBaseParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBitExpressionAtom(GBaseParser.BitExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionAtom(GBaseParser.StringExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpressionAtom}
	 * labeled alternative in {@link GBaseParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionAtom(GBaseParser.StringExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(GBaseParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(GBaseParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(GBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(GBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(GBaseParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(GBaseParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(GBaseParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(GBaseParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(GBaseParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(GBaseParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#stringOperator}.
	 * @param ctx the parse tree
	 */
	void enterStringOperator(GBaseParser.StringOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#stringOperator}.
	 * @param ctx the parse tree
	 */
	void exitStringOperator(GBaseParser.StringOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void enterCharsetNameBase(GBaseParser.CharsetNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void exitCharsetNameBase(GBaseParser.CharsetNameBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevelBase(GBaseParser.TransactionLevelBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevelBase(GBaseParser.TransactionLevelBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegesBase(GBaseParser.PrivilegesBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegesBase(GBaseParser.PrivilegesBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterIntervalTypeBase(GBaseParser.IntervalTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitIntervalTypeBase(GBaseParser.IntervalTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeBase(GBaseParser.DataTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeBase(GBaseParser.DataTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsCanBeId(GBaseParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsCanBeId(GBaseParser.KeywordsCanBeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GBaseParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameBase(GBaseParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GBaseParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameBase(GBaseParser.FunctionNameBaseContext ctx);
}