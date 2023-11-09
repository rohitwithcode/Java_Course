package Chapter_16_Regular_Expression;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile_Number_Validation {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

//        System.out.println("Enter your number here : ");
//        String s=scanner.nextLine();
//
//        // Ten digit number validation Regular Expression
//
//        Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
//        Matcher matcher=pattern.matcher(s);
//
//        if (matcher.find()){
//            System.out.println("Your number is correct....");
//        }else{
//            System.out.println("Please enter a valid number");
//        }

//        System.out.println("Enter your number here : ");
//        String s=scanner.nextLine();
//
//        // Eleven(11) digit or ten digit number validation Regular Expression
//
//        Pattern pattern=Pattern.compile("0?[6-9][0-9]{9}");
//        Matcher matcher=pattern.matcher(s);
//
//        if (matcher.find()){
//            System.out.println("Your number is correct....");
//        }else{
//            System.out.println("Please enter a valid number");
//        }

        System.out.println("Enter your number here : ");
        String s=scanner.nextLine();

        // Twelve(12) or Eleven(11) digit or ten(10) digit number validation Regular Expression

        Pattern pattern=Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher matcher=pattern.matcher(s);

        if (matcher.find()){
            System.out.println("Your number is correct....");
        }else{
            System.out.println("Please enter a valid number");
        }
    }
}
