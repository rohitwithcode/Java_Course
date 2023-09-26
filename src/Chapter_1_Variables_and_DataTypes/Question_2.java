package Chapter_1_Variables_and_DataTypes;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your Good Name here = ");
        String str=scanner.nextLine();

        System.out.println("Hello "+str+" have a good day");
    }
}
