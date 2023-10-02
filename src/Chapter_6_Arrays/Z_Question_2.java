package Chapter_6_Arrays;

import java.util.Scanner;

public class Z_Question_2 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the Array size : ");
        int size=scanner.nextInt();


        int [] arr=new int[size];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the int numbers : "+(i+1));
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter a number which you find it in the array : ");
        int find=scanner.nextInt();
        int present=0;
        for (int i=0;i<arr.length;i++){

            if (find==arr[i]){
                present=1;
                break;
            }
        }
        if (present==1){
            System.out.println("This number "+find+" present in the array ");
        }
        else {
            System.out.println("This number "+find+" is not present in the array");
        }
    }
}
