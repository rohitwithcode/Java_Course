package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {

        System.out.println("*****Recursion Program******");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();

        int fact=factorial(n);
        System.out.println("The factorial of "+n+" is "+fact);
    }
}
