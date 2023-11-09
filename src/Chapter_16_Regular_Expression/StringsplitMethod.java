package Chapter_16_Regular_Expression;

public class StringsplitMethod {
    public static void main(String[] args) {

        String string="code with rohit";

        String [] s=string.split("\\s");

        for (String s1:s){
            System.out.println(s1);
        }
    }
}
