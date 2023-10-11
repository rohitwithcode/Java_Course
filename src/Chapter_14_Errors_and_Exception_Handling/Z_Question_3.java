package Chapter_14_Errors_and_Exception_Handling;

import java.util.Scanner;

public class Z_Question_3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int [] arr=new int[5];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the number : ");
            arr[i]=scanner.nextInt();
        }
        boolean input=true;
        int index;
        int i=0;
        while (input && i<5){
            try {
                System.out.println("Enter value of index : ");
                index=scanner.nextInt();
                System.out.println("Value of arr[index] is "+arr[index]);
                break;
            }catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if (i>4){
            System.out.println("You have an error because you don't give valid index in 5 chances ... Sorry!");
        }
    }
}
