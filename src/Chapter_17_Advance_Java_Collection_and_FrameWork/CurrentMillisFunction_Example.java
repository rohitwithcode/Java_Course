package Chapter_17_Advance_Java_Collection_and_FrameWork;

import static java.lang.System.currentTimeMillis;

public class CurrentMillisFunction_Example {
    public static void main(String[] args) {
        System.out.println(currentTimeMillis()); // System.currentTimeMillis() return milliSeconds
        System.out.println("The Total seconds since 1970 are : "+currentTimeMillis()/1000);
        System.out.println("The Total minutes since 1970 are : "+currentTimeMillis()/1000/60);
        System.out.println("The Total hours since 1970 are : "+currentTimeMillis()/1000/3600);
        System.out.println("The Total days since 1970 are : "+currentTimeMillis()/1000/3600/24);
        System.out.println("The Total Years from 1970 are : "+currentTimeMillis()/1000/60/60/24/365);

    }
}
