package Chapter_16_Regular_Expression;

import java.util.regex.Pattern;

public class RE_split_method {
    public static void main(String[] args) {

//        Pattern pattern=Pattern.compile("\\s");
//        String []  s =pattern.split("Code With Rohit");
//
//        for (String s1:s) {
//            System.out.println(s1);
//        }

//        Pattern pattern=Pattern.compile("a");
//        String []  s =pattern.split("Dwanshi With Rohit");
//
//        for (String s1:s) {
//            System.out.println(s1);
//        }

//        Pattern pattern=Pattern.compile("o");
//        String []  s =pattern.split("Dwanshi With Rohit");
//
//        for (String s1:s) {
//            System.out.println(s1);
//        }

//        Pattern pattern=Pattern.compile("\\.");
//        String []  s =pattern.split("www.codewithrohit.com");
//
//        for (String s1:s) {
//            System.out.println(s1);
//        }

        Pattern pattern=Pattern.compile("[.]");
        String []  s =pattern.split("www.codewithrohit.com");

        for (String s1:s) {
            System.out.println(s1);
        }
    }
}
