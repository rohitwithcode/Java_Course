package Chapter_7_Methods_and_Recursion;

import java.util.Scanner;

public class Z_Question_1 {
    static  void table(int t){
        for (int i=1;i<=10;i++){
            System.out.println(t+"X"+i+" ="+i*t);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int t=scanner.nextInt();
        System.out.println("\n\nThe Table the of the "+t+" is given below......\n");
        table(t);
    }
}
