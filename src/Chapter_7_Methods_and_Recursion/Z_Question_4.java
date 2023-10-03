package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Z_Question_4 {
    static  void Pattern(int number){
        for (int row=1;row<=number;row++){
            int column=1;
            for (;column<=number-row+1;column++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number=scanner.nextInt();
        System.out.println("Your Pattern given below....\n");
        Pattern(number);
    }
}
