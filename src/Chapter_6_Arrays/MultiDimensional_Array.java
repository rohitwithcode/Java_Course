package Chapter_6_Arrays;

import java.util.Scanner;

public class MultiDimensional_Array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int [][] arr=new int[2][3];

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("Enter the number : ");
                arr[i][j]=scanner.nextInt();
            }
        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(+arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
