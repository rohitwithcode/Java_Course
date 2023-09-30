package Chapter_4_Conditionals;

import java.util.Scanner;

public class Z_Question_4_Leap_year {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Year here : ");
        int year=scanner.nextInt();

        if (year%400==0){
            System.out.println("Leap year");
        } else if (year%4==0 && year%100!=0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
