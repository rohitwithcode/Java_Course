package Chapter_4_Conditionals;

import java.util.Scanner;

public class Z_Question_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your income : ");
        Long income=scanner.nextLong();
        float tax=0;
        if (income<=250000){
            System.out.println("You are safe, You don't have need to pay Tax !");
        }
       else if (income > 250000 && income <=500000) {
            tax=tax + 0.05f * (income-250000);
        }
        else if (income > 500000 && income <=1000000) {
            tax=tax + 0.05f * (500000-250000);
            tax=tax + 0.20f * (income-500000);
        }
        else if (income > 1000000 ) {
            tax=tax + 0.05f * (500000-250000);
            tax=tax + 0.20f * (1000000-500000);
            tax=tax + 0.20f * (income-100000);
        }
        System.out.println("You pay the "+tax+" Tax on your "+income+" income");
    }
}
