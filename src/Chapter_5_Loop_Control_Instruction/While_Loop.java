package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {

        System.out.println("WHILE LOOP.........");

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number ");
        int n=scanner.nextInt();

        int i= 1;
        while (i<=n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\n\nFinish While Loop \n\n\t\t\tThank You");
    }
}
