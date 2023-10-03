package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Z_Question_3 {
    static  int Recursive_sum(int n){
        int sum=0;
        if (n>0){
            sum=n+Recursive_sum(n-1);
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int t=scanner.nextInt();

        int sum=Recursive_sum(t);
        System.out.println("The sum of the "+t+" natural numbers : "+sum);
    }
}
