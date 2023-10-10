package Chapter_14_Errors_and_Exception_Handling;

import java.util.Scanner;

public class Finally_Block_Example {
    public static void Nothing(){
        Scanner scanner=new Scanner(System.in);
        try {
            for (int i=0;i<=100;i++){
                if (i==5){
                    break;
                }
                int a=5;
                System.out.println("Enter value you want to divide with ");
                int div=scanner.nextInt();
                System.out.println("Division : "+(a/div));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am always run ....");
        }
    }
    public static void main(String[] args) {
        Nothing();
    }
}
