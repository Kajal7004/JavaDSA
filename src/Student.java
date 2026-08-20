public class Student {
    //Attributes
    private int id;
    private String name;
    private int age;
    private int nos;
    private String gf;

    //getter used to access the private attributes of the class
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getNos() {
        return nos;
    }
    public String getGf() {
        return gf;
    }


    //setter used to modify the private attributes of the class
    //also we can add extra check/validation to maintain the integrity of the data
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNos(int nos) {
        this.nos = nos;
    }
    public void setGf(String gf) {
        this.gf = gf;
    }


    //Default Constructor
    public Student(){
       System.out.println("Default Constructor called");
    }

    //parameterized constructor
    public Student(int id, String name, int age, int nos, String gf) {
        System.out.println("Parameterized Constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }

    //copy constructor
    public Student (Student srcobj) {
        System.out.println("Copy Constructor called");
        this.id = srcobj.id;
        this.name = srcobj.name;
        this.age = srcobj.age;
        this.nos = srcobj.nos;
        this.gf = srcobj.gf;
    }

    //methods
    public void study(){
        System.out.println(name + " is studying.");
    }
    public void bunk(){
        System.out.println(name + " is bunking.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
    private void gfChatting(){
        System.out.println(name + " is having a girlfriend.");
    }
    
    public void showGf() {
        System.out.println("Girlfriend's name: " + gf);
    }
}