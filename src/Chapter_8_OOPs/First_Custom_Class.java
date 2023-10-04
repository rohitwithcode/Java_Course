package Chapter_8_OOPs;

class Employee{
    int id;
    String name;
    public void display(){
        System.out.println("Your id is : "+id);
        System.out.println("Your name is : "+name);
    }
}

public class First_Custom_Class {
    public static void main(String[] args) {

        Employee coder=new Employee(); // Instantiating a new Employee object
        Employee code=new Employee(); // Instantiating a new Employee object
        coder.id=45;
        coder.name="Rohit";
        coder.display();

        code.id=56;
        code.name="Radhey";
        code.display();
//        Printing the Attributes
//        System.out.println("Your id is : "+coder.id);
//        System.out.println("Your name is : "+coder.name);
    }
}
