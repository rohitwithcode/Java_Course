package Chapter_9_Access_Modifiers_and_Constructor;

class Employee_Code{
    private int id;
    private String name;
    private int salary;
    public Employee_Code(){ // Default Constructor
        name="Rohit";
        id=1;
        salary=34400;
    }
    public Employee_Code(String n,int i){
        name=n;
        id=i;
        salary=45660;
    }
    public Employee_Code(String n,int i,int s){
        name=n;
        id=i;
        salary=s;
    }
    public void display(){
        System.out.println("Employee Name is : "+name);
        System.out.println("Employee id is "+id);
        System.out.println("Employee Salary is "+salary);
    }
/*
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
*/
}

public class Constructors {
    public static void main(String[] args) {
        Employee_Code employee_code=new Employee_Code();
        employee_code.display();

        Employee_Code employee_code1=new Employee_Code("CoderRohit",3);
        employee_code1.display();

        Employee_Code employee_code2=new Employee_Code("CoderRohit",3,455000);
        employee_code2.display();

//        employee_code.setName("Coder");
//        System.out.println(employee_code.getName());
    }
}
