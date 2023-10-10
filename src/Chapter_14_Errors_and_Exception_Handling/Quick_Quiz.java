package Chapter_14_Errors_and_Exception_Handling;

import java.util.Scanner;

public class Quick_Quiz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean bool=true;
        int[] marks = new int[5];
        for (int i=0;i<marks.length;i++) {
            System.out.println("Enter the number : ");
            marks[i] = scanner.nextInt();
        }
        while (bool){
            System.out.println("Enter the array index : ");
            int index=scanner.nextInt();
            try {
                System.out.println("Value at index "+index+" is "+marks[index]);
            bool=false;
        }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception occurred array out of bound ");
        }
        }
        System.out.println("User entered the valid index :");
    }
}
