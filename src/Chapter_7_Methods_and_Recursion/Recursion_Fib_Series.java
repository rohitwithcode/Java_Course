package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Recursion_Fib_Series {
    static  int fib(int n)
    {
        if(n==1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {

        System.out.println("*****Recursion Program******");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();

        int f=fib(n);
        System.out.println("The fibonacci number term at "+n+" is "+f);
    }
}
