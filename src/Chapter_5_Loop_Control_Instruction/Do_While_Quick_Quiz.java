package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class Do_While_Quick_Quiz {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number ");
        int n=scanner.nextInt();

        int i=0;
        do {
            System.out.println(i);
            i++;
        }while (i<=n);
        System.out.println("Thank For Using Do While Loop");
    }
}
