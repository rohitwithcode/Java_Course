package Chapter_6_Arrays;

import java.util.Scanner;

public class Z_Question_1 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the Array size : ");
        int size=scanner.nextInt();

        float sum=0;
        float [] arr=new float[size];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the float numbers : "+(i+1));
            arr[i]=scanner.nextFloat();
        }
        System.out.println("These numbers enterd by the user...");
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Sum of these numbers : "+sum);
    }
}
