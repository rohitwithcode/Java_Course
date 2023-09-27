package Chapter_2_Operators_and_Expressions;

import java.util.Scanner;

public class Z_Question_3 {
    public static void main(String[] args) {

        int given=45;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number = ");
        int user=scanner.nextInt();

        System.out.println(given>user);
    }
}
