package Chapter_16_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    1.It is used to match the character sequence .
    2.To get the object you can call pattern object matcher method.

    Pattern pattern=Pattern.compile("expression");
    Matcher matcher=pattern.matcher("MxxY");
 */
public class Matcher_Class {
    public static void main(String[] args) {

//        Pattern pattern=Pattern.compile("coder rohit");
//        Matcher matcher=pattern.matcher("coder rohit");
//        if (matcher.matches()){
//            System.out.println("Pattern Matched ");
//        }
//        else {
//            System.out.println("Pattern not matched");
//        }


//        Pattern pattern1=Pattern.compile("[abcd]");
//        Matcher matcher1=pattern1.matcher("a");
//        if (matcher1.matches()){
//            System.out.println("Pattern Matched ");
//        }
//        else {
//            System.out.println("Pattern not matched");
//        }

//        Pattern pattern2=Pattern.compile("[a-z]");
//        Matcher matcher2=pattern2.matcher("B");
//        if (matcher2.matches()){
//            System.out.println("Pattern Matched ");
//        }
//        else {
//            System.out.println("Pattern not matched");
//        }

//        Pattern pattern3=Pattern.compile("[0-9]");
//        Matcher matcher3=pattern3.matcher("3");
//        if (matcher3.matches()){
//            System.out.println("Pattern Matched ");
//        }
//        else {
//            System.out.println("Pattern not matched");
//        }

        Pattern pattern4=Pattern.compile("[^abcd]");
        Matcher matcher4=pattern4.matcher("r");
        if (matcher4.matches()){
            System.out.println("Pattern Matched ");
        }
        else {
            System.out.println("Pattern not matched");
        }


    }
}
