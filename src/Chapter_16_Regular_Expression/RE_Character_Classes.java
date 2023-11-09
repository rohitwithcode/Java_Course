package Chapter_16_Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE_Character_Classes {
    public static void main(String[] args) {

//        Pattern pattern=Pattern.compile("[abc]");
//        Matcher matcher=pattern.matcher("a7b@z#9$");
//
//        while (matcher.find()){
//            System.out.println("The character "+matcher.group()+" is found at index "+matcher.start());
//        }

//        Pattern pattern1=Pattern.compile("[^abc]"); // find all alphabets except abc
//        Matcher matcher1=pattern1.matcher("a7b@z#9$");
//
//        while (matcher1.find()){
//            System.out.println("The character "+matcher1.group()+" is found at index "+matcher1.start());
//        }

//        Pattern pattern2=Pattern.compile("[a-z]"); // find small character in target string
//        Matcher matcher2=pattern2.matcher("a7b@z#9$");
//
//        while (matcher2.find()){
//            System.out.println("The character "+matcher2.group()+" is found at index "+matcher2.start());
//        }

//        Pattern pattern3=Pattern.compile("[A-Z]"); // find upper case character in target string
//        Matcher matcher3=pattern3.matcher("a7b@z#9$");
//
//        while (matcher3.find()){
//            System.out.println("The character "+matcher3.group()+" is found at index "+matcher3.start());
//        }

//        Pattern pattern4=Pattern.compile("[a-zA-Z]"); // find any alphabet symbol in target string
//        Matcher matcher4=pattern4.matcher("a7b@z#9A$");
//
//        while (matcher4.find()){
//            System.out.println("The character "+matcher4.group()+" is found at index "+matcher4.start());
//        }

//        Pattern pattern5=Pattern.compile("[0-9]"); // find any digit 0 - 9 target string
//        Matcher matcher5=pattern5.matcher("a7b@z#9$3420adf3^3#$#43");
//
//        while (matcher5.find()){
//            System.out.println("The character "+matcher5.group()+" is found at index "+matcher5.start());
//        }

//        Pattern pattern6=Pattern.compile("[a-zA-Z0-9]"); // find any alpha numeric symbol in target string
//        Matcher matcher6=pattern6.matcher("a7b@z#9$dfl343lf!@@#$$%$%lf44f");
//
//        while (matcher6.find()){
//            System.out.println("The character "+matcher6.group()+" is found at index "+matcher6.start());
//        }

        Pattern pattern7=Pattern.compile("[^a-zA-Z0-9]"); //Except any alpha numeric symbol in target string
        Matcher matcher7=pattern7.matcher("a7b@z#9$dfl343lf!@@#$$%$%lf44f");

        while (matcher7.find()){
            System.out.println("The character "+matcher7.group()+" is found at index "+matcher7.start());
        }
    }
}
