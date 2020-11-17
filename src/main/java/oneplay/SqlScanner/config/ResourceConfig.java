package oneplay.SqlScanner.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class ResourceConfig {

    public static final Set<String> SUPPORT_SCHEMA = new HashSet<String>(){{
        add("GBase");
        add("MySql");
    }};

    public static InputStream getInputStream(String filename) {
        String userDir = System.getProperty("user.dir");
        String[] paths = new String[]{filename, "conf" + File.separator + filename};
        try {
            for (String path : paths) {
                File file = new File(userDir + File.separator + path);
                if (file.exists()) {
                    return new FileInputStream(file);
                }
            }
        } catch (IOException ignored) {
        }
        return ResourceConfig.class.getResourceAsStream("/" + filename);
    }

}
