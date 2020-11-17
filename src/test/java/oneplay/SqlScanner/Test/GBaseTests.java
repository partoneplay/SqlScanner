package oneplay.SqlScanner.Test;

import oneplay.SqlScanner.SqlScanner;
import org.junit.Test;

public class GBaseTests {

    @Test
    public void test() {
        SqlScanner sqlScanner = new SqlScanner("GBase");
        sqlScanner.scan(new String[]{"D:\\IdeaProject\\SqlScanner\\examples\\test.sql"});
    }

}
