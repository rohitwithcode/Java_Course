package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianClass_Example {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();

//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(calendar.DATE));
//        System.out.println(calendar.HOUR);
//        System.out.println(calendar.MINUTE);
//        System.out.println(calendar.HOUR_OF_DAY+":"+calendar.get(calendar.MINUTE)+":"+calendar.get(calendar.SECOND));

        GregorianCalendar gregorianCalendar=new GregorianCalendar();

        System.out.println(gregorianCalendar.isLeapYear(2023));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println(TimeZone.getAvailableIDs()[6]);
        System.out.println(TimeZone.getDefault());
    }
}
