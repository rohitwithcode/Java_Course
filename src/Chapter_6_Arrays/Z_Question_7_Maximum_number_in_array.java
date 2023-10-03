package Chapter_6_Arrays;

import java.util.Scanner;

public class Z_Question_7_Maximum_number_in_array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int arr []=new int[size];

        for (int i=0;i<size;i++){
            System.out.println("Enter the array element : ");
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<size;i++){

            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in array is : "+max);
    }
}
