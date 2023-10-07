package Chapter_12_Packages;

import java.util.Scanner;
//import java.util.*;

public class How_to_import_packages {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
//        java.util.Scanner scanner=new java.util.Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("Scanner import taking input "+a);
    }
}
