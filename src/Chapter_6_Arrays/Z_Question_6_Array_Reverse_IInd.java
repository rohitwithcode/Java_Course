package Chapter_6_Arrays;

import java.util.Scanner;

public class Z_Question_6_Array_Reverse_IInd {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int size=scanner.nextInt();

        int arr [] =new int[size];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the element : ");
            arr[i]=scanner.nextInt();
        }

        System.out.println("\n\nArray in Reverse Order .......\n\n");
        for (int i=size-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
