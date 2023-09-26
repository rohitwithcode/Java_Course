package Chapter_1_Variables_and_DataTypes;

import java.util.Scanner;

public class Taking_User_Input {
    public static void main(String[] args) {

//      ***  Taking User Input Program ***

        System.out.println("Taking User Input ");

        Scanner sc=new Scanner(System.in);

//        System.out.print("Enter the first nubmer = ");
//        int a=sc.nextInt();
//        float x=sc.nextFloat();
//        System.out.print("Enter the second nubmer = ");
//        int b=sc.nextInt();
//        float y=sc.nextFloat();
//        int c=a+b;
//        float d=x +y;
//        System.out.println("Sum of these numbers is "+c);
//        System.out.println("Sum of these numbers is "+d);

//        boolean b=sc.hasNextInt();
//        System.out.println(b);

        System.out.println("Enter the string here = ");
//        String  str=sc.next();
//        System.out.println(str);

        String str1=sc.nextLine();
        System.out.println(str1);

    }
}
