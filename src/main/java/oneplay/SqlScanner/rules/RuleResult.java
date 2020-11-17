package oneplay.SqlScanner.rules;

import org.antlr.v4.runtime.Token;

public class RuleResult {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String description; // 描述说明
    private String absolutePath; // 文件绝对路径

    public RuleResult(Token start, Token stop, String description) {
        this.x1 = start.getLine();
        this.y1 = start.getCharPositionInLine();
        this.x2 = stop.getLine();
        this.y2 = stop.getCharPositionInLine();
        this.description = String.format("From [%3d,%3d] to [%3d,%3d] %s", x1, y1, x2, y2, description == null ? "" : description);
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public String getDescription() {
        return description;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String filename) {
        this.absolutePath = filename;
    }

    @Override
    public String toString() {
        return description;
    }

}
