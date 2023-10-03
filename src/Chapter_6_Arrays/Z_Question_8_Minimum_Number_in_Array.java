package Chapter_6_Arrays;

import java.util.Scanner;

public class Z_Question_8_Minimum_Number_in_Array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int [] Minimum_Array =new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the array element at index "+(i+1)+" = ");
            Minimum_Array[i]=scanner.nextInt();
        }
        int minimum_Element=Minimum_Array[0];
        for (int i=1;i<size;i++)
        {
            if (Minimum_Array[i]<minimum_Element){
                minimum_Element=Minimum_Array[i];
            }
        }
        System.out.println("Minimum Element in Array is : "+minimum_Element);
    }
}
