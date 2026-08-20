package Organization;

public class Developer extends Employee {
    private  String ProgrammingLanguage;

    public Developer(int empId, String empName, String lang) {
        super(empId, empName);
        this.ProgrammingLanguage = lang;
    }

    public void show() {
        System.out.println("Programming Language: " + ProgrammingLanguage);
    }
}
