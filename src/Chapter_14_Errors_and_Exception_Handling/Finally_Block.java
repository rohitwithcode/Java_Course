package Chapter_14_Errors_and_Exception_Handling;

public class Finally_Block {
    public static int divide() {
        try {
            int x = 3;
            int y = 2;
            int c = x / y;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Program Finished...");
        }
        return -1;
    }

    public static void main(String[] args) {
        int d=divide();
        System.out.println(d);
    }
}
