package Chapter_14_Errors_and_Exception_Handling;

import java.util.Scanner;

public class Handling_Specific_Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter the number : ");
            marks[i] = scanner.nextInt();
        }
            System.out.println("Enter the array index : ");
            int index = scanner.nextInt();

            System.out.println("Enter the number you want to divide the value with ");
            int number = scanner.nextInt();
            try {
                System.out.println("The value at index which is entered by you " + marks[index]);
                System.out.println("The value of array-value/number is : " + marks[index] / number);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occurred");
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of Bound Exception occurred ....");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Other Exception occurred");
                e.printStackTrace();
            }
    }
}