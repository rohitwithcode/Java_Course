package Chapter_16_Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIDs_Validation {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your mail id : ");
        String mailID=scanner.nextLine();

        // Gmail Id Validation Regular Expression

        Pattern pattern=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com");
        Matcher matcher=pattern.matcher(mailID);

        if(matcher.find()){
            System.out.println("Gmail Id is valid");
        }
        else {
            System.out.println("Please enter a valid Gmail ID.");
        }

//        System.out.println("Enter your mail id : ");
//        String mailID=scanner.nextLine();
//
//        // Any Mail Id Validation Regular Expression
//
//        Pattern pattern=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9])+");
//        Matcher matcher=pattern.matcher(mailID);
//
//        if(matcher.find()){
//            System.out.println("Gmail Id is valid");
//        }
//        else {
//            System.out.println("Please enter a valid Gmail ID.");
//        }
    }
}
