package tech.tkys.java.study.main;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateTimeSample {
    public static void useDate() {
        Date now = new Date();
        System.out.println(now);
    }

    public static void useCalender() {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
    }

    public static void useSimpleDateFormat() throws Exception {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formattedText = dateFormat.format(now);

        Date date = dateFormat.parse("2018/01/08 13:34:21");
    }
}
