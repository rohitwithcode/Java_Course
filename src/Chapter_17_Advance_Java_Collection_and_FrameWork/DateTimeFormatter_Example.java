package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Example {
    public static void main(String[] args) {

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy --E H:m:s a");
        String myDate=dateTimeFormatter.format(localDateTime);
        System.out.println(myDate);




    }
}
