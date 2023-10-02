package Chapter_6_Arrays;

import java.util.Scanner;

public class Array_Basic {
    public static void main(String[] args) {

        /*
           --> There are Three main ways to create an Array in Java
           1. Declaration and Memory Allocation
           2. Declaration and then Memory Allocation
           3. Declaration,Memory Allocation and Initialization Together
         */


//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Enter the array size : ");
//        int n=scanner.nextInt();

//  ***** 1. Array Declaration + Memory Allocation ******
//        int [] marks=new int[n];

//        marks[0]=23;
//        marks[1]=45;
//        marks[2]=56;
//        marks[3]=67;
//        marks[4]=78;
//        marks[5]=89; // If the size is 5 of array,This throwing error
//        System.out.println(marks[4]);

//  ***** 2. Array Declaration and then Memory Allocation *****

//        int [] marks;
//        marks=new int[n];
//
//        marks[0]=23;
//        marks[1]=45;
//        marks[2]=56;
//        marks[3]=67;
//        marks[4]=78;
//        marks[5]=89; // If the size is 5 of array,This throwing error
//        System.out.println(marks[4]);

//***** 3. Array Declaration,Memory Allocation and Intialization together

        int [] marks={23,34,45,67,78};

        System.out.println(marks[2]);
        System.out.println(marks[4]);
    }
}
