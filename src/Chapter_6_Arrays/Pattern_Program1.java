package Chapter_6_Arrays;

import java.util.Scanner;

/*
 *
 **
 ***
 ****
 *****
 */
public class Pattern_Program1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the value of number : ");
        int number=scanner.nextInt();

        int row=1;

        while (row <= number){
            int column=1;
            while (column <=row ){
                System.out.print("*");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
