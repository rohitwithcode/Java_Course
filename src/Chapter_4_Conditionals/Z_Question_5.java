package Chapter_4_Conditionals;

import java.util.Scanner;

public class Z_Question_5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the website URL : ");
        String str=scanner.next();

        if (str.endsWith(".com")){
            System.out.println("Commercial Website");
        } else if (str.endsWith(".org")) {
            System.out.println("Organization Website");
        } else if (str.endsWith(".in")) {
            System.out.println("Indian Website");
        }
        else {
            System.out.println("This is not a valid website url\n\tThank you");
        }
    }
}
