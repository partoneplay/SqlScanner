package oneplay.SqlScanner.utils;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class DatetimeUtils {

    public static String now(String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
        DateTime dateTime = new DateTime(new Date());
        return dateTime.toString(dateTimeFormatter);
    }

    public static int secondsPassed(String refer, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
        DateTime referDateTime = dateTimeFormatter.parseDateTime(refer);
        DateTime dateTime = new DateTime(new Date());
        Period period  = new Interval(referDateTime.getMillis(), dateTime.getMillis()).toPeriod();
        return period.getSeconds();
    }

}
