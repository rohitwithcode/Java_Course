package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the table number : ");
        int n=scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"X"+i+" = "+n*i);
        }
        System.out.println("\n\nFinishing the For Loop\n\n\t\t\tThank You.");
    }
}
