package Chapter_6_Arrays;

import java.util.Scanner;

public class Z_Question_9_Array_is_Sorted {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int [] sorted_Array =new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the array element at index "+(i+1)+" = ");
            sorted_Array[i]=scanner.nextInt();
        }
        boolean sort=true;
        for (int i=0;i<sorted_Array.length-1;i++){
            if (sorted_Array[i]>sorted_Array[i+1]){
                sort=false;
                break;
            }
        }
        if (sort){
            System.out.println("\n\nArray is sorted  \n");
        }
        else {
            System.out.println("\n\nArray is not Sorted \n");
        }
    }
}
