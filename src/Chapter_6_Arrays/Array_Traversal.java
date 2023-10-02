package Chapter_6_Arrays;

import java.util.Scanner;

public class Array_Traversal {
    public static void main(String[] args) {


//        float array []={4.5f,6.7f,6.7f};
//        System.out.println(array.length);
//        System.out.println(array[2]);

//        String arr []={"Rohit","Mohit","Radha","Mayank"};
//        System.out.println(arr.length);
//        System.out.println(arr[2]);


        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size=scanner.nextInt();

        int array_Traversal []=new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the the value at index "+(i+1)+" = ");
            array_Traversal[i]=scanner.nextInt();//array_Traversal[i];
        }
//        Printing Using for Loop
        System.out.println("Printing Using For Loop");
        System.out.println("\n......Displaying an Array.......");

        for (int i=0;i<array_Traversal.length;i++){
            System.out.println(array_Traversal[i]);
        }
    }
}
