package Organization;

public class HRManager extends Employee {

    public HRManager(int empId, String empName) {
        super(empId, empName);
    }

    public void handleHrDuties(){
        System.out.println("Handling HR duties.");
    }
}