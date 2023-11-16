package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.util.Date;

public class Date_Example {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date date=new Date();
        System.out.println(date);

//        Date date1=new Date(123,10,16);
//        System.out.println(date1);
//
//        Date date2=new Date(123,10,16,11,10);
//        System.out.println(date2);
//
//        Date date3=new Date(123,8,3,4,23,45);
//        System.out.println(date3);
//
//        Long l=System.currentTimeMillis()/1000;
//        Date date4=new Date(l);
//        System.out.println(date4);

        System.out.println(date.getTime()); // return date in milliseconds
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getSeconds());
        System.out.println(date.getDay());
        System.out.println(date.getYear());
        System.out.println(date.getMinutes());
        System.out.println(date.getMonth());


    }
}
