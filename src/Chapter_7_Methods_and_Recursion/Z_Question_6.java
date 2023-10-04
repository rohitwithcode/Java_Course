package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Z_Question_6 {

    static void Recursive_pattern(int number){
        if (number>0){
            Recursive_pattern(number-1);
            for (int i=0;i<number;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number=scanner.nextInt();

        Recursive_pattern(number);

    }
}
