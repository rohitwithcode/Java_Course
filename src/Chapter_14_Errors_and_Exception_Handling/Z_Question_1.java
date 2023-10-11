package Chapter_14_Errors_and_Exception_Handling;

import java.util.Scanner;

public class Z_Question_1 {
    public static void main(String[] args) {
//        System.out.println("Syntax Error....");
//        int a=6  Syntax Error

//        System.out.println("Logical Error .....");


        System.out.println("Runtime Error....");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a= scanner.nextInt();
        System.out.println("Enter the number you want to divide with ");
        int b=scanner.nextInt();

        System.out.println("Divide : "+(a/b));

    }
}
