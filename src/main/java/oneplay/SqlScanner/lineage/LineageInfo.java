package oneplay.SqlScanner.lineage;

import java.util.ArrayList;
import java.util.List;

public class LineageInfo {
    private List<TableInfo> fromTableList = new ArrayList<>(); // 源表
    private TableInfo toTable; // 目标表

    public void addFromTable(TableInfo fromTable) {
        this.fromTableList.add(fromTable);
    }

    public List<TableInfo> getFromTableList() {
        return fromTableList;
    }

    public void setFromTableList(List<TableInfo> fromTableList) {
        this.fromTableList = fromTableList;
    }

    public TableInfo getToTable() {
        return toTable;
    }

    public void setToTable(TableInfo toTable) {
        this.toTable = toTable;
    }

    public List<String> toMermaidList() {
        List<String> mermaidList = new ArrayList<>();
        for (TableInfo tableInfo : fromTableList) {
            mermaidList.add(tableInfo.getTableName() + " --> " + toTable.getTableName());
        }
        return mermaidList;
    }

}
