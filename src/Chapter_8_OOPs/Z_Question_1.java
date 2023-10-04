package Chapter_8_OOPs;

class Employee1{
    int salary;
    String name;
    public void setName(String s){
        name=s;
    }
    public String  getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}

public class Z_Question_1 {
    public static void main(String[] args) {

        Employee1 e1=new Employee1();

        e1.setName("Rohit");
        e1.salary=45;

        int salary= e1.getSalary();
        System.out.println("The salary of the employee is "+salary);

        String name=e1.getName();
        System.out.println("The Name of the employee is "+name);
    }
}
