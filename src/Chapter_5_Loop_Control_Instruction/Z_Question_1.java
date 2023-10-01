package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class Z_Question_1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the row number : ");
        int n=scanner.nextInt();

        int row=1;

        while (row<=n){

            int column=1;
                    while (column <= n-row+1){
                        System.out.print("*");
                        column++;
                    }
                    System.out.printf("\n");
                    row++;
        }

    }
}
