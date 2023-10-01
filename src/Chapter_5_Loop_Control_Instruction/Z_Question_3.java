package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class Z_Question_3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Table number : ");
        int n=scanner.nextInt();
        System.out.println("The Table of "+n+" is given below ---->\n\n\n");
        for (int i=10;i>=1;i--){
            System.out.println(n+"X"+i+" = "+i*n);
        }
    }
}
