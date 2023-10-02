package Chapter_6_Arrays;

import java.util.Scanner;

public class Z_Question_3 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the Array size : ");
        int size=scanner.nextInt();


        int [] arr=new int[size];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the number in physycs of student no. "+(i+1));
            arr[i]=scanner.nextInt();
        }

        float average=0;

        for(float avg:arr){
            average=average+avg;
        }
        System.out.println("The average of students : "+average/arr.length);
    }
}
