package Chapter_4_Conditionals;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age=scanner.nextInt();

        switch (age)
        {
            case 18:
                System.out.println("You are a Child");
                break;
            case 23:
                System.out.println("You are young ");
                break;
            case 35:
                System.out.println("you are a Man");
                break;
            case 60:
                System.out.println("You are Experienced");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
