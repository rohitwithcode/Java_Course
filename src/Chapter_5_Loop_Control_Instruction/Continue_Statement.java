package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class Continue_Statement {
    public static void main(String[] args) {

//        continue Statement using the for loop

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
//
//        System.out.println("\n\n continue Statement using the FOR LOOP........\n\n");
//        for (int i=1;i<=n;i++){
//            if (i==15){
//                System.out.println("Skip the Iteration "+i);
//                continue;
//            }
//                System.out.println(i);
//        }
//        System.out.println("Control Out from the Loop!");

//        continue statement using the WHILE LOOP

//        System.out.println("\n\ncontinue Statement using the WHILE LOOP......\n\n");
//        int i=0;
//        while (i<=n){
//            i++;
//            if (i==5){
//                System.out.println("Skip the Iteration "+i);
//                continue;
//            }
//            System.out.println(i);
//        }

        System.out.println("\n\ncontinue Statement using the DO WHILE LOOP......\n\n");
        int j=0;
        do {
            j++;
            if (j==5){
                System.out.println("Skip the Iteration "+j);
                continue;
            }
            System.out.println(j);
        }while (j<=n);

    }
}
