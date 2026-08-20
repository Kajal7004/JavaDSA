package Organization;

public class Employee {
    protected int empId;
    protected String empName;

    public Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}
