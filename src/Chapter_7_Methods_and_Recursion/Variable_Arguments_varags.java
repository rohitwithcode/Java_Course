package Chapter_7_Methods_and_Recursion;

public class Variable_Arguments_varags {
   /* static  int sum(int a,int b){
        return a+b;
    }
    static  int sum(int a,int b,int c){
        return a+b+c;
    }
    static  int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    */
//   static  int sum(int a,int...arr){   //At least One Arguments is required now
    static  int sum(int...arr){
//        This is avaible as int int [] ar;
        int result=0;
        for (int a:arr){
            result +=a;
        }
        return  result;
    }
    public static void main(String[] args) {

        System.out.println("Welcome the Code With Rohit Plateform");
        System.out.println("The sum of Nothing : "+sum());
        System.out.println("The sum of one number is : "+sum(3));
        System.out.println("The sum of the two numbers is : "+sum(5,6));
        System.out.println("The sum of the three numbers is : "+sum(5,6,7));
        System.out.println("The sum of the four numbers is : "+sum(5,6,7,8));
    }
}
