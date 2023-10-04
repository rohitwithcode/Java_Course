package Chapter_9_Access_Modifiers_and_Constructor;

import java.util.Scanner;

class Employee{
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }
    public  void  setId(int i){
        id=i;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

}

public class Access_Modifiers {
    public static void main(String[] args) {

        Employee code=new Employee();

//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Enter the id of the employee : ");
//        int id=scanner.nextInt();
//
//        System.out.println("Enter the name of the employee : ");
//        String  name=scanner.nextLine();

        code.setId(4);
        int i=code.getId();
        System.out.println("The id of the employee is "+i);


        code.setName("Rohit");
        String s=code.getName();
        System.out.println("The name of the employee is "+s);

    }
}
