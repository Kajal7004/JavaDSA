public class App {
    public static void main(String[] args) {
        //Default Constructor
//         Student A = new Student();
//         A.id = 1;
//         A.name = "Kajal";
//         A.age = 22;
//         A.nos = 5;
//         System.out.println( A.name);
//         System.out.println("Student ID: " + A.id);
//         System.out.println("Student Age: " + A.age);
//         System.out.println("Number of Subjects: " + A.nos);

//         A.study();
//         A.bunk();
//         A.sleep();

        //Parameterized constructor
        // Student A = new Student(1, "Rahul", 22, 5);
        // System.out.println( A.name);
        // System.out.println( A.id);
        // System.out.println( A.age);
        // System.out.println( A.nos);
       
        // A.study();
        // A.bunk();   
        // A.sleep();

        //Copy constructor
        // Student B = new Student(A); 
        // System.out.println( B.name);
        // System.out.println( B.id);
        // System.out.println( B.age);
        // System.out.println( B.nos);

        // B.study();

        //Encapsulation
             Student A = new Student(1, "Rahul", 22, 5, "Tina");
        System.out.println( A.getId());
        System.out.println( A.getName());
        System.out.println( A.getAge());
        System.out.println( A.getNos());
        System.out.println( A.getGf());

        A.setAge(33);
        System.out.println( A.getAge());
        A.showGf ();
 }
}
