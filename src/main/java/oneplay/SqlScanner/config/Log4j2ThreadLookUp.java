package oneplay.SqlScanner.config;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;

@Plugin(name = "Log4j2ThreadLookUp", category = StrLookup.CATEGORY)
public class Log4j2ThreadLookUp implements StrLookup {

    @Override
    public String lookup(String key) {
        return Thread.currentThread().getName();
    }

    @Override
    public String lookup(LogEvent logEvent, String s) {
        String threadName = logEvent.getThreadName();
        if (threadName != null) {
            return threadName;
        } else {
            return Thread.currentThread().getName();
        }
    }

}