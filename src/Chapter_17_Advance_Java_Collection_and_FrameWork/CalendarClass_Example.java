package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass_Example {
    public static void main(String[] args) {

//        Calendar calendar=Calendar.getInstance();
//
//        System.out.println(calendar.getCalendarType());
//        System.out.println(calendar.getTimeZone().getID());


        Calendar calendar=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone().getID());



    }
}
