package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class Z_Question_4_Factorial {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number to find the Factorial : ");
        int n=scanner.nextInt();

        int i=1;
        int fact=1;

        while (i<=n){
            if (i>0) {
                fact = fact * i;
            }
            i++;
        }
        System.out.println("The Factorial of "+n+" is "+fact);
    }
}
