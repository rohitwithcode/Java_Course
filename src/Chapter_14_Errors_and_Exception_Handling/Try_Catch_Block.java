package Chapter_14_Errors_and_Exception_Handling;



public class Try_Catch_Block {
    public static void main(String[] args) {
        int a=50;
//        int b=9;
        int d=0;
        try {
            int x=a/d;
            System.out.println("The Result is : "+x);
        }catch (Exception e){
            System.out.println("Sorry\n\tWe can't divide this process..");
            System.out.println("Reason is :"+e);
        }
        System.out.println("End of the Program...");
    }
}
