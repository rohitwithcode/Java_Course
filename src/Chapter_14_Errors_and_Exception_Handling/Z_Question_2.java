package Chapter_14_Errors_and_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z_Question_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a= scanner.nextInt();
        System.out.println("Enter the number you want to divide with ");
        int b=scanner.nextInt();
        try {
            System.out.println("Divide : "+(a/b));
        }catch (ArithmeticException e){
            System.out.println("HaHa");
        }catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }catch (InputMismatchException e){
            System.out.println("I know very well...");
        }



    }
}
