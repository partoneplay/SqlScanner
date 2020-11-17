package oneplay.SqlScanner.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

public class Log4jConfig {

    public static void config() {
        String userDir = System.getProperty("user.dir");
        String[] paths = new String[]{"log4j2.xml", "conf" + File.separator + "log4j2.xml"};
        for (String path : paths) {
            File file = new File(userDir + File.separator + path);
            if (file.exists()) {
                LoggerContext loggerContext = (LoggerContext) LogManager.getContext(false);
                loggerContext.setConfigLocation(file.toURI());
                loggerContext.reconfigure();
                return;
            }
        }
    }

}
