package Chapter_16_Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        int count=0;
        Pattern pattern=Pattern.compile("ab"); // we are searching for ab
        Matcher matcher=pattern.matcher("ababbaba"); // Target String

        while (matcher.find()){
            count++;
            System.out.println("ab find at index : "+matcher.start());
        }
        System.out.println("The total number of occurrences of ab :"+count);
    }
}
