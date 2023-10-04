package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Z_Question_7 {
    static  void Recursive_Pattern(int number){
        if (number>0){
            for (int  i=0;i<number;i++){
                System.out.print("*");
            }
            System.out.println("");
            Recursive_Pattern(number-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number=scanner.nextInt();

        Recursive_Pattern(number);
    }
}
