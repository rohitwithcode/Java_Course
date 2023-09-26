package Chapter_1_Variables_and_DataTypes;

import java.util.Scanner;

public class Exercise_1_Calculate_Student_Percentage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the Hindi marks (0-100) = ");
        int h= scanner.nextInt();
        System.out.print("Enter the English marks (0-100) = ");
        int e= scanner.nextInt();
        System.out.print("Enter the Maths marks (0-100) = ");
        int m= scanner.nextInt();
        System.out.print("Enter the Science marks (0-100) = ");
        int s= scanner.nextInt();
        System.out.print("Enter the Drawing marks (0-100) = ");
        int d= scanner.nextInt();

        float percentage=(h+e+m+s+d)/5f;
        int total=h+e+m+s+d;

        System.out.println("Percentage of student is "+percentage);
        System.out.println("The total of student marks is "+total);
    }
}
