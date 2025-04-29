package Employee;

public class Employee {
    //Field(attributes)
    String name;
    int id;
    double salary;

    //Constructor
    public Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    //Method to display Employee details
    public void displayInfo(){
        System.out.println("Employee Id:"+ id);
        System.out.println("Employee Name:"+ name);
        System.out.println("Salary Id:"+ salary);
    }

    //Main Method
    public static void main(String[] args) {
        //
        Employee emp1=new Employee("Mamatha", 306, 50000.0);
        emp1.displayInfo();
    }
}