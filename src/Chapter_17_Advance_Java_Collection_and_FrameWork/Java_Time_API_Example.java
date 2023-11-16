package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Java_Time_API_Example {
    public static void main(String[] args) {

        Clock clock=Clock.systemUTC();
        System.out.println(clock);

        DayOfWeek dayOfWeek=DayOfWeek.of(4);
        System.out.println(dayOfWeek);

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        Month month=Month.of(5);
        System.out.println(month);

        MonthDay monthDay=MonthDay.now();
        System.out.println(monthDay);

        OffsetDateTime offsetDateTime=OffsetDateTime.now();
        System.out.println(offsetDateTime);

        OffsetTime offsetTime=OffsetTime.now();
        System.out.println(offsetTime);

        Period period=Period.of(2022,5,23);
        System.out.println(period);

        Year year=Year.now();
        System.out.println(year);

        YearMonth yearMonth=YearMonth.now();
        System.out.println(yearMonth);

        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId zoneId=ZoneId.of("Asia/Singapore");
        System.out.println(zoneId);

    }
}
