/**
 * @author lowstef
 * @create 2018/8/22
 * @since 1.0.0
 */
package demo1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

public class Test7 {

    public static void main(String[] args) {

        String str = "100";
        Integer integer = Integer.parseInt(str);
        System.out.println(integer);

        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println(hour + ":" + minute + ":" + second);
        LocalTime now1 = LocalTime.now();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        LocalDate now2 = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
        LocalDateTime with = now.with(temporalAdjuster);
        System.out.println(with);
        MonthDay now3 = MonthDay.now();
        System.out.println(now3);
        Instant now4 = Instant.now();
        System.out.println(now4);
        long epochSecond = now4.getEpochSecond();
        System.out.println(epochSecond);
        long l = now4.toEpochMilli();
        System.out.println(l);
        Integer i1 = 5;
        int i2 = 5;
        System.out.println(i1 == i2);
        String[] strings = new String[5];
        

    }


}
