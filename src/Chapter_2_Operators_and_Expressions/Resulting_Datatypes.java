package Chapter_2_Operators_and_Expressions;

public class Resulting_Datatypes {
    public static void main(String[] args) {
        /* byte x=4;
        int y=6;
        short z=7;
        int q=x+z;
        int a=45+5;
        float b=45.4f+5;

        System.out.println(b);
        System.out.println(q);
*/
//        Increment and Decrement Operators

        int i=4;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int j=6;
        int c=++j;
        System.out.println(j);
        System.out.println(c);

        char ch='D';
        ch++;
        System.out.println(ch);
    }
}
