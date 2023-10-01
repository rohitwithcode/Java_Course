package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class Z_Question_5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Table number : ");
        int n=scanner.nextInt();
        System.out.println("The Table of "+n+" is given below ---->\n\n\n");
        int sum=0;
        for (int i=1;i<=10;i++){
            System.out.println(n+"X"+i+" = "+(i*n));
            sum=sum+(n*i);
        }
        System.out.println("The sum of numbers which is lies in multiplication Table of "+n+" is "+sum);
    }
}
