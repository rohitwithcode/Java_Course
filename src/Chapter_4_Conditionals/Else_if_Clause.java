package Chapter_4_Conditionals;

import java.util.Scanner;

public class Else_if_Clause {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the age = ");
        int age=scanner.nextInt();

        if (age>34){
            System.out.println("You are young");
        } else if (age>22) {
            System.out.println("You in mid age");
        } else if (age>18) {
            System.out.println("You are eligible");
        }
        else {
            System.out.println("You are child");
        }
    }
}
