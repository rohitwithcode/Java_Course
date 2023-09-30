package Chapter_4_Conditionals;

import java.util.Scanner;

public class Z_Question_1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the subject math marks of student : ");
        int math=scanner.nextInt();
        System.out.println("Enter the subject english marks of student : ");
        int english=scanner.nextInt();
        System.out.println("Enter the subject chemistry marks of student : ");
        int chemistry=scanner.nextInt();
        System.out.println("Enter the subject physycs marks of student : ");
        int physycs=scanner.nextInt();

        float total=(math+english+chemistry+physycs)/4.0f;
        System.out.println("Your percentage is "+total);
        if (total >= 40 && (math >= 33 && english >= 33 && chemistry >= 33 && physycs >= 33)){

            System.out.println("You are pass");
        }
        else {
            System.out.println("You are fail");
        }


    }
}
