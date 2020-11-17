package oneplay.SqlScanner.utils;

import java.util.Collections;

public class IndentUtils {

    private int indent = 0;

    public String getIndentString(String s) {
        return String.join("", Collections.nCopies(indent, "\t")) + s;
    }

    public void indent() {
        indent++;
    }

    public void unindent() {
        indent--;
    }

}
