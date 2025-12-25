// TODO: Create an class called Employee
class Employee{
    private String name;
    private double salary;


    //constructor
    public Employee(){

    }

    //Parametarized constructor
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;

    }

    public String getDetails(){

        String result= "Name: "+this.name+","+" Salary: "+this.salary;
        return result;
    }

}

// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee{
    private String department;

    public Manager(String name,double salary,String department){
        super(name,salary);
        this.department=department;


    }
    public String getDetails(){
        return super.getDetails()+", Department: "+department;
    }



}


public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee obj_emp=new Employee("Alice",50000);
        Manager obj = new Manager("Bob",80000,"IT");
        // TODO: Print their details using getDetails()
        System.out.println(obj_emp.getDetails());
        System.out.print(obj.getDetails());
    }
}
