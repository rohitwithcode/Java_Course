package Chapter_16_Regular_Expression;

import java.util.StringTokenizer;

public class StringTokenizer_Class {
    public static void main(String[] args) {

//        String s="code with rohit";
//        StringTokenizer stringTokenizer=new StringTokenizer(s);
//
//        while (stringTokenizer.hasMoreTokens()){
//            System.out.println(stringTokenizer.nextToken());
//        }

        StringTokenizer stringTokenizer=new StringTokenizer("09-11-2023","-");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
