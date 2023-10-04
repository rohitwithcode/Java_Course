package Chapter_4_Conditionals;

import java.util.Random;
import java.util.Scanner;

public class Exercise_2_Rock_Paper_Scissor {
    public static void main(String[] args) {

//        Enter 0 for Rock.......
//        Enter 1 for Paper.......
//        Enter 2 For Scissor......

        Scanner scanner=new Scanner(System.in);
        int user_Count=0;
        int computer_Count=0;
        for (int i=1;i<=5;i++){
            System.out.println("Dear Player Please Enter O for Rock,1 for Paper and 2 for Scissor: ");
            int user_Input=scanner.nextInt();

            Random random=new Random();
            int computer_Input=random.nextInt(3);

            if (user_Input == computer_Input){
                System.out.println("Match Draw");
            }
            else if (user_Input==0 && computer_Input==2 || user_Input==1 && computer_Input==0 || user_Input==2 && computer_Input==1){
                System.out.println("Dear Player\n\t\tCongratulations\n\t\t\tYou Win......");
                user_Count++;
            }
            else {
                System.out.println("Computer Win........");
                computer_Count++;
            }
            System.out.println("Computer Input is "+computer_Input);
        }

        if (user_Count>computer_Count){
            System.out.println("\n\tUser Win this series "+user_Count+"/"+computer_Count+" out of 5 Matches ");
        } else if (computer_Count>user_Count) {
            System.out.println("\n\tComputer Win this series "+computer_Count+"/"+user_Count+" out of 5 Matches ");
        }
        else {
            System.out.println("\n\tMatch Draw with"+user_Count+"/"+computer_Count+" out of 5 Matches ");
        }

    }
}
