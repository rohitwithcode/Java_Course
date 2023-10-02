package Chapter_6_Arrays;

import java.util.Scanner;

public class Array_Traversal_Reverse {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size=scanner.nextInt();

        int arr []=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.print("Enter the the value at index "+(i+1)+" = ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("......Displaying An Array in Reverse Order...... ");

        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
