package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Z_Question_5 {
    static int Recursive_Fibonacci(int number){

        if (number==1){
            return 0;
        }
        if (number==2){
            return 1;
        }
        else {
            return Recursive_Fibonacci(number-2)+Recursive_Fibonacci(number-1);
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number=scanner.nextInt();

        System.out.println("Your Fibonacci sequence given below......\n");

        int fib=Recursive_Fibonacci(number);
        System.out.println("The "+number+" term of fibonacci sequence is "+fib);

    }
}
