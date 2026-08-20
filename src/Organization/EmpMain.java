package Organization;

public class EmpMain {
    public static void main(String[] args) {

        //Simple Inheritance -->(Employee class --> Developer class) 
        // Employee emp = new Employee(101, "John Doe");
        // emp.display();
        // Developer dev = new Developer(102, "Jane Smith", "Java");
        // dev.display();
        // dev.show();

        //Multilevel Inheritance -->(Employee class --> HRManager class --> HRDirector class)
        // HRDirector hrDir = new HRDirector(103, "Kajal");
        // hrDir.display();
        // hrDir.handleHrDuties();
        // hrDir.manageHrDuties();

        //Multiple Inheritance -->(Employee class --> TechLead interface, ProjectManager interface)
        // TechLead techLead = new TechLead(104, "Alice");
        // System.out.println(techLead.empId + " " + techLead.empName);
        // techLead.manageProject();
        // techLead.leadTeam();

        //Hierarchical Inheritance -->(Employee class --> Developer class, HRManager class)
        // Developer dev = new Developer(105, "Bob", "Python");
        // dev.display();
        // HRManager hrManager = new HRManager(106, "Charlie");
        // hrManager.display();




    }

}
