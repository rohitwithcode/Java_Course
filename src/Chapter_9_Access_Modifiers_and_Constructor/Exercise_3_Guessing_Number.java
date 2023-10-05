package Chapter_9_Access_Modifiers_and_Constructor;

import java.util.Scanner;

class Game{
    private int computer_input;
    int no_of_guesses=1;
    private int user_input;
    Game(){
        computer_input=(int)(Math.random()*100);
    }
    public int getComputer_input(){
        return computer_input;
    }
    public void setUser_input(int n){
        user_input=n;
    }
    public int getUser_input(){
        return user_input;
    }
    public int is_Correct_Number(){

        if (computer_input==user_input){
            return 1;
        } else if (computer_input>user_input) {
            return -1;
        }
        else {
            return 0;
        }
    }
    public void setNo_of_guesses(){
        no_of_guesses++;
    }
    public void getNo_of_guesses(){
        System.out.println("You enter a correct number in "+no_of_guesses+" terms \n\t\t\t\t\t\tThank You...");
    }
}
public class Exercise_3_Guessing_Number {
    public static void main(String[] args) {
        Game game=new Game();

        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.print("Enter number (0-100) : ");
            int number=scanner.nextInt();
            game.setUser_input(number);

            if (game.is_Correct_Number()==1){
                System.out.println("Congratulations.....\n\t\tYou Guess a Correct number\n\t\t\t\tYour Input "+game.getUser_input()+" and Computer input is "+game.getComputer_input());
                game.getNo_of_guesses();
                break;
            } else if (game.is_Correct_Number()==-1) {
                game.setNo_of_guesses();
                System.out.println("Please enter big number...");
            }
            else {
                game.setNo_of_guesses();
                System.out.println("Please enter small number ....");
            }
        }
    }
}
