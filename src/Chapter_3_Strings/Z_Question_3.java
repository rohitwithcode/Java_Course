package Chapter_3_Strings;

public class Z_Question_3 {
    public static void main(String[] args) {

        String L="Dear <|name|>, Thanks a lot!";
       L= L.replace("<|name|>","Rohit");
        System.out.println(L);
    }
}
