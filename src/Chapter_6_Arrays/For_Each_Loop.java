package Chapter_6_Arrays;

import java.util.Scanner;

public class For_Each_Loop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size=scanner.nextInt();

        int [] arr =new int[size];

        for (int i=0;i<arr.length;i++){
            System.out.print("Enter the the value at index "+(i+1)+" = ");
            arr[i]=scanner.nextInt();
        }

        System.out.println("......Displaying An Array by For Each Loop...... ");

        for (int For_Each_Loop:arr){
            System.out.println(For_Each_Loop);
        }

    }
}
