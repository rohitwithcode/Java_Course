package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class For_Loop_Decrementing {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=scanner.nextInt();

        for (int i=n;i>=1;i--){
            System.out.println(i*2);
        }
    }
}
