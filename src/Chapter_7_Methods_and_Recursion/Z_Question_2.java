package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Z_Question_2 {
    static void Pattern(int n){

        for (int row=1;row<=n;row++){
            int column=1;
            for (column=1;column<=row;column++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Pattern Program Print below....\n");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int t=scanner.nextInt();

        Pattern(t);
    }
}
