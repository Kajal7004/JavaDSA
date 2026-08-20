package Organization;

public class TechLead extends Employee implements ProjectManager, TeamLead {

    public TechLead(int empId, String empName) {
        super(empId, empName);
    }
   public void manageProject() {
        System.out.println("Managing project as a Tech Lead.");
    }

    public void leadTeam() {
        System.out.println("Leading team as a Tech Lead.");
    }
    
}
