package Chapter_6_Arrays;

import java.util.Scanner;

public class Z_Question_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of row matrix one : ");
        ;
        int row = scanner.nextByte();

        System.out.println("Enter the size of column matrix one : ");
        ;
        int column = scanner.nextByte();

        int[][] matrix1 = new int[row][column];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.print("Enter the number = ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix one given below ......");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Enter the size of row matrix Two : ");
        ;
        int row2 = scanner.nextByte();

        System.out.println("Enter the size of column matrix Two : ");
        ;
        int column2 = scanner.nextByte();

        int[][] matrix2 = new int[row2][column2];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {

                System.out.print("Enter the number = ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix Two given below ......");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }

        int[][] result_Matrix = new int[2][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result_Matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\n\nSum of metrix is given below......");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(result_Matrix[i][j] + " ");
                result_Matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }
    }
}
