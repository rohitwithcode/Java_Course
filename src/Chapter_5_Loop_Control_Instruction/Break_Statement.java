package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class Break_Statement {
    public static void main(String[] args) {

//        Break Statement using the for loop

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
//
//        System.out.println("\n\n Break Statement using the FOR LOOP........\n\n");
//        for (int i=1;i<=n;i++){
//        System.out.println(i);
//            if (i==15){
//                System.out.println("Finishing the FOR Loop");
//                break;
//            }
//        }
//        System.out.println("Control Out from the Loop!");

//        Break statement using the WHILE LOOP

//        System.out.println("\n\nBreak Statement using the WHILE LOOP......\n\n");
//        int i=1;
//        while (i<=n){
//            System.out.println(i);
//
//            if (i==5){
//                System.out.println("Finishing the WHILE LOOP !!!!");
//                break;
//            }
//            i++;
//
//        }

        System.out.println("\n\nBreak Statement using the DO WHILE LOOP......\n\n");
        int j=1;
        do {
            System.out.println(j);

            if (j==5){
                System.out.println("Finishing the DO WHILE LOOP !!!!");
                break;
            }
            j++;
        }
        while (j<=n);
    }
}
