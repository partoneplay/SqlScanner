package oneplay.SqlScanner.rules;

import org.antlr.v4.runtime.Token;

public class RuleResult {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String s;

    public RuleResult (int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public RuleResult (int x1, int y1, int x2, int y2, String s) {
        this(x1, y1, x2, y2);
        this.s = s;
    }

    public RuleResult (Token start, Token stop) {
        this(start.getLine(), start.getCharPositionInLine(), stop.getLine(), stop.getCharPositionInLine());
    }

    public RuleResult (Token start, Token stop, String s) {
        this(start, stop);
        this.s = s;
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

    public String getS() {
        return s == null ? "" : s;
    }

    @Override
    public String toString() {
        String str = String.format("From [%3d,%3d] to [%3d,%3d]", x1, y1, x2, y2);
        if (s != null) {
            str += " " + s;
        }
        return str;
    }
}
