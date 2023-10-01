package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class For_Loop_Quick_Quiz {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=scanner.nextInt();

        System.out.println("Odd Number.......");
//        for(int i=0;i<n;i++){
//            if(i%2 != 0){
//                System.out.println(i);
//            }
//        }

//        for (int i=0;i<n;i++){
//            System.out.println(i*2+1);
//        }

        for (int i=1;i<=n;i++){
            System.out.println(i*2-1);
        }
    }
}
