package Chapter_3_Strings;

import java.util.Scanner;

public class Z_Question_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string : ");
        String str=scanner.nextLine();

        System.out.println("Your Original String is : "+str);
        System.out.println("Your string in LowerCase :"+ str.replace(" ","_"));
    }
}
