package Chapter_3_Strings;

public class String_Methods {
    public static void main(String[] args) {

//        String a="Rohit";
//        String n=new String("Rohit");
//        System.out.println(n);

//        String Length() Function
        System.out.println("\n\nString Length Method .......");
        String name="Rohit";
        System.out.println("Your  string is : "+name);
        System.out.println("Your string Length is : "+name.length());

//        String LowerCase() Method
        System.out.println("\n\nString in LowerCase Method .......");
        System.out.println("Your  string is : "+name);
        String lower=name.toLowerCase();
        System.out.println("Your string in LowerCase is : "+lower);

        //        String UpperCase() Method
        System.out.println("\n\nString in UpperCase Method .......");
        System.out.println("Your  string is : "+name);
        String upper=name.toUpperCase();
        System.out.println("Your string in UpperCase is : "+upper);


//        String Trim() Method
        System.out.println("\n\n String Trim() method .......");
        String notTrimString = "     Coder Rohit    BCA        ";
        System.out.println("Your Original String is : "+notTrimString);
        System.out.println("Your String after trimmed : "+notTrimString.trim());
        String trimString =notTrimString.trim();
        System.out.println("Your String after trimmed : "+trimString);


//        String subString() Method
        System.out.println("\n\n String subString() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your string after subString Method : " +name.substring(2));

        //        String Second subString() Method
        System.out.println("\n\n String Second subString() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your string after subString Method : " +name.substring(1,4));

        //        String replace() Method
        System.out.println("\n\n String replace() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your string after replace Method : " +name.replace('R','M'));
        System.out.println("Your string after replace Method : " +name.replace("ohi","oo"));
        System.out.println("Your string after replace Method : " +name.replace("o","M"));

        //        String startsWith() Method
        System.out.println("\n\n String startsWith() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your string is starstWith : " +name.startsWith("Ro"));

        //        String endsWith() Method
        System.out.println("\n\n String endsWith() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your string is endstWith : " +name.endsWith("Ro"));

        //        String charAt() Method
        System.out.println("\n\n String charAt() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your character is  : " +name.charAt(3));

        //        String indexOf() Method
        System.out.println("\n\n String indexOf() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your string index is : " +name.indexOf("h"));

        //        String indexOf() Method
        String name1="Rohhiittii";
        System.out.println("\n\n String indexOf() method .......");
        System.out.println("Your Original String : "+name1);
        System.out.println("Your string index from  : " +name1.indexOf("ii",5));

        //        String lastIndexOf() Method
        System.out.println("\n\n String lastIndexOf() method .......");
        System.out.println("Your Original String : "+name1);
        System.out.println("Your string Lastindex is  : " +name1.lastIndexOf("ii"));

        //        String lastIndexOf() Method
        System.out.println("\n\n String lastIndexOf() method .......");
        System.out.println("Your Original String : "+name1);
        System.out.println("Your string Lastindex is  : " +name1.lastIndexOf("ii",4));

        //        String equals() Method
        System.out.println("\n\n String equals() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your string is equals : " +name.equals("Rohit"));

        //        String equalsIgnoreCase() Method
        System.out.println("\n\n String equalsIgnoreCase() method .......");
        System.out.println("Your Original String : "+name);
        System.out.println("Your string is equals : " +name.equalsIgnoreCase("roHit"));



    }

}
