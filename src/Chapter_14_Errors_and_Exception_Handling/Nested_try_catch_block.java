package Chapter_14_Errors_and_Exception_Handling;

import java.util.Scanner;

public class Nested_try_catch_block {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter the number : ");
            marks[i] = scanner.nextInt();
        }
        System.out.println("Enter the array index : ");
        int index=scanner.nextInt();
        try {
            System.out.println("Welcome to Code With Rohit Platform....");
            try {
                System.out.println(marks[index]);
                try {
                    System.out.print("Enter the number : ");
                    int a=scanner.nextInt();
                    System.out.print("Enter the number b you want to divide with : ");
                    int b=scanner.nextInt();
                    System.out.println("Division of "+a+" and "+b+" is "+(a/b));
                }catch (ArithmeticException e){
                    System.out.print("Exception in Layer 3 ");
                    System.out.println("Arithmetic Exception occurred");
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.print("Exception in layer 2 ");
                System.out.println("Array out of bound index Exception");
            }
        }catch (Exception e){
            System.out.println("Exception in layer 1");
        }
    }
}
