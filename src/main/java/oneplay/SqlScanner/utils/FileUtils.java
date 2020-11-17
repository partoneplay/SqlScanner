package oneplay.SqlScanner.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static Logger logger = LogManager.getLogger(FileUtils.class);

    /**
     * 获取指定路径下所有文件的绝对路径
     *
     * @param path 路径
     * @return 包含全部文件绝对路径的列表
     */
    public static List<String> getAllAbsoluteFiles(String path) {
        List<String> pathList = new ArrayList<>();
        File file = new File(path);
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            if (fs != null) {
                for (File f : fs) {
                    pathList.addAll(getAllAbsoluteFiles(f.getAbsolutePath()));
                }
            }
        } else if (file.isFile()) {
            pathList.add(file.getAbsolutePath());
        }
        return pathList;
    }

    /**
     * 获取相对与某个路径的路径
     *
     * @param absolutePath 绝对路径
     * @param referPath    参考路径
     */
    public static String getRelativePath(String absolutePath, String referPath) {
        String refer = new File(referPath).getAbsolutePath();
        if (absolutePath.startsWith(refer)) {
            String relativePath = absolutePath.substring(refer.length());
            return relativePath.startsWith(File.separator) ? relativePath.substring(1) : relativePath;
        }
        return "";
    }

    /**
     * 指定开始结束位置，返回区间内容
     */
    public static String getFileClipContent(String path, int x1, int y1, int x2, int y2) {
        StringBuilder result = new StringBuilder();
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(path));
            String line;
            while ((line = lineNumberReader.readLine()) != null) {
                int lineNumber = lineNumberReader.getLineNumber();
                if (lineNumber < x1) continue;
                if (lineNumber > x2) break;
                if (lineNumber == x1 && x1 == x2) {
                    result.append(line, y1, y2 + 1);
                } else if (lineNumber == x1) {
                    result.append(line.substring(y1));
                } else if (lineNumber == x2) {
                    result.append("\n").append(line, 0, y2 + 1);
                } else {
                    result.append("\n").append(line);
                }
            }
        } catch (IOException e) {

            logger.error(e);
        }
        return result.toString();
    }

    /**
     * 创建文件，如果父目录不存在则创建父目录，如果文件已存在，不做任何操作
     *
     * @param absPath 需要创建的路径
     */
    public static void touchFile(String absPath) throws IOException {
        int index = absPath.lastIndexOf(File.separator);
        mkDirs(absPath.substring(0, index < 0 ? 0 : index));
        File file = new File(absPath);
        if (!file.exists()) {
            if (file.createNewFile()) {
                logger.debug("Success to create new file " + file.getName());
            }
        }
    }

    /**
     * 递归创建文件夹
     *
     * @param dirPath 需求创建的路径
     */
    public static void mkDirs(String dirPath) {
        File dir = new File(dirPath);
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                logger.debug("Success to mkdir " + dir.getAbsolutePath());
            }
        }
    }

}
