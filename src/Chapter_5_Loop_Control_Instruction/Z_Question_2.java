package Chapter_5_Loop_Control_Instruction;

import java.util.Scanner;

public class Z_Question_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=scanner.nextInt();

        int i=1;
        int sum=0;
        while (i<=n){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum of even numbers between 1 to "+n+" is "+sum);
    }
}
