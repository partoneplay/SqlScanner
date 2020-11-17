package oneplay.SqlScanner.antlr;

public enum NodeName {
    ignored, // 忽略
    dmlStatement, // 一个完整的sql语句
    insertStatement, // insert 语句
    querySpecification, // 一个查询或者子查询
    aggregateWindowedFunction, // 聚合函数
    tableSourceItem, // 源表
    filterClause, // 筛选条件
    expressionAtomPredicate, // 计算表达式元素
    joinPart // join子句
}
