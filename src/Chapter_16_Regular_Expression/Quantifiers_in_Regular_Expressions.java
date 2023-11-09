package Chapter_16_Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers_in_Regular_Expressions {
    public static void main(String[] args) {

//        Pattern pattern=Pattern.compile("a"); // be exactly one in target string
//        Matcher matcher=pattern.matcher("aaaabbbadaaabaaaab");
//
//        while (matcher.find()){
//            System.out.println("Character "+matcher.group()+" is find at index : "+matcher.start());
//        }

//        Pattern pattern1=Pattern.compile("a+"); // be At least one in target string
//        Matcher matcher1=pattern1.matcher("aaaabbbadaaabaaaab");
//
//        while (matcher1.find()){
//            System.out.println("Character "+matcher1.group()+" is find at index : "+matcher1.start());
//        }

//        Pattern pattern2=Pattern.compile("a*"); // any number of a including any number also  in target string
//        Matcher matcher2=pattern2.matcher("aaaabbbadaaabaaaab");
//
//        while (matcher2.find()){
//            System.out.println("Character "+matcher2.group()+" is find at index : "+matcher2.start());
//        }

        Pattern pattern3=Pattern.compile("a?"); // At most one 'a' in target string
        Matcher matcher3=pattern3.matcher("aaaabbbadaaabaaaab");

        while (matcher3.find()){
            System.out.println("Character "+matcher3.group()+" is find at index : "+matcher3.start());
        }
    }
}
