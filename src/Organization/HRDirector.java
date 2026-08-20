package Organization; 

public class HRDirector extends HRManager {

    public HRDirector(int empId, String empName) {
        super(empId, empName);
    }
    
    public void manageHrDuties() {
        System.out.println("Managing HR duties.");
    }
}