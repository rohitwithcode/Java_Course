package Chapter_16_Regular_Expression;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pre_Defined_Character_Classes {
    public static void main(String[] args) {

//        Pattern pattern=Pattern.compile("\\s"); // Except only Space character
//        Matcher matcher=pattern.matcher("Aa3 y@0");
//
//        while (matcher.find()){
//            System.out.println("The space "+matcher.group()+" is find at index "+matcher.start());
//        }

//        Pattern pattern1=Pattern.compile("\\S"); // Any character Except space in target string
//        Matcher matcher1=pattern1.matcher("Aa3 y@0");
//
//        while (matcher1.find()){
//            System.out.println("The Character "+matcher1.group()+" is find at index "+matcher1.start());
//        }

//        Pattern pattern2=Pattern.compile("\\d"); // Any digit in target String
//        Matcher matcher2=pattern2.matcher("Aa df a3 y@0fe3os44@2$%%&^r");
//
//        while (matcher2.find()){
//            System.out.println("The digit "+matcher2.group()+" is find at index "+matcher2.start());
//        }

//        Pattern pattern3=Pattern.compile("\\D"); // Any Character except any digit in target String
//        Matcher matcher3=pattern3.matcher("Aa df a3 y@0fe3os44@2$%%&^r");
//
//        while (matcher3.find()){
//            System.out.println("The character "+matcher3.group()+" is find at index "+matcher3.start());
//        }

//        Pattern pattern4=Pattern.compile("\\w"); // Any word character or any digit in target String
//        Matcher matcher4=pattern4.matcher("Aa df a3 y@0fe3os44@2$%%&^r");
//
//        while (matcher4.find()){
//            System.out.println("The character "+matcher4.group()+" is find at index "+matcher4.start());
//        }

//        Pattern pattern5=Pattern.compile("\\W"); // Except Any word character or any digit (only Special Symbols) in target String
//        Matcher matcher5=pattern5.matcher("Aa df a3 y@0fe3os44@2$%%&^r");
//
//        while (matcher5.find()){
//            System.out.println("The special symbol "+matcher5.group()+" is find at index "+matcher5.start());
//        }

        Pattern pattern6=Pattern.compile("."); // Any word character,any digit including special symbol also in target String
        Matcher matcher6=pattern6.matcher("Aa df a3 y@0fe3os44@2$%%&^r");

        while (matcher6.find()){
            System.out.println("The digit "+matcher6.group()+" is find at index "+matcher6.start());
        }
    }
}
