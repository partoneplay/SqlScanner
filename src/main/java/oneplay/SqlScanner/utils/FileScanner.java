package oneplay.SqlScanner.utils;

import org.antlr.v4.runtime.RecognitionException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class FileScanner {
    private static Logger logger = LogManager.getLogger(FileScanner.class);

    private String schema;

    public FileScanner(String schema) {
        this.schema = schema;
    }

    public String getSchema() {
        return schema;
    }

    public void scan(String[] paths) {
        for (String path : paths) {
            File file = new File(path);
            if (file.exists()) {
                scan(file);
            } else {
                logger.error(file.getAbsoluteFile() + " not exists !");
            }
        }
    }

    public void scan(File file) {
        if (file.isFile()) {
            scanFile(file);
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        scanFile(f);
                    } else if (f.isDirectory()) {
                        scan(f);
                    }
                }
            }
        }
    }

    public void scanFile(File file) {
        try {
            if (file.isFile()) {
                if (!file.getName().toLowerCase().endsWith(".sql")) {
                    logger.info("Skipping " + file.getAbsoluteFile());
                } else {
                    logger.info("Scanning " + file.getAbsoluteFile());
                    logger.debug("Do something with file " + file.getAbsolutePath());
                }
            }
        } catch (RecognitionException e) {
            String msg = "SyntaxError";
            if (file != null) {
                msg += " " + file.getAbsolutePath();
            }
            logger.error(msg);
        } catch (Exception e) {
            logger.error(e);
        }
    }

}
