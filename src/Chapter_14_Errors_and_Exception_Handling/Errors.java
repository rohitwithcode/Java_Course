package Chapter_14_Errors_and_Exception_Handling;

import java.util.Scanner;

public class Errors {
 /*   // There are three types errors :
        1.Syntax Error
        2.Logical Error
        3.Runtime Error

  */
    public static void main(String[] args) {
        System.out.println("Syntax Errors ....");
//        int x=3 Syntax error No Semicolon
//        d=6; Syntax Error d is not declared
//        System.out.println(x+e); Syntax Error e is not declared

        System.out.println("Logical Errors .....");
        // Write a program to print prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);
        }

        System.out.println("RunTime Errors .....");
//        Runtime Errors
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number = ");
        int a=scanner.nextInt();
        System.out.println("Division of 100 by a : "+100/a);

    }
}
