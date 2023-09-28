package Chapter_3_Strings;

import java.util.Scanner;

public class String_Basic {
    public static void main(String[] args) {
        String name=new String("Rohit");
        System.out.println(name);
        String n="Coder";
        System.out.print("The name is ");
        System.out.println(n);
        int a=4;
        float f=4.5f;
        System.out.printf("The value of a is %d and the value of f is %f ",a,f);
        System.out.format("\nThe value of a is %d and the value of f is %f \n",a,f);

        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the string ");
//        String st=scanner.next();
//        System.out.println(st);
        System.out.print("Enter the string : ");
        String st1=scanner.nextLine();
        System.out.println(st1);
    }
}
