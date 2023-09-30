package Chapter_4_Conditionals;

import java.util.Scanner;

public class Enhance_Switch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age=scanner.nextInt();

        switch (age) {
            case 18 ->{
                System.out.println("You are a Child");
                System.out.println("You are beautiful");
                System.out.println("You are awesome");
            }
            case 23 -> System.out.println("You are young ");
            case 35 -> System.out.println("you are a Man");
            case 60 -> System.out.println("You are Experienced");
            default -> System.out.println("Invalid number");
        }
    }
}
