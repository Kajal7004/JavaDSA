package Polymorphism;

public class Main {
    public static void main (String[] args) {
        // Calculator c = new Calculator();
        // System.out.println(c.add(2,3));
        // System.out.println(c.add(2,3,5));
        // System.out.println(c.add(2,3,5.5));
        // System.out.println(c.add("Hello", "World"));

        //RunTime Polymorphism
        //Function Overriding
        // Circle c = new Circle();
        // c.draw();

        //Upcasting
        Circle c = new Circle();
        doDrawStuff(c);

        
    }
    public static  void doDrawStuff(Shape s) {
            s.draw();

            Circle c = (Circle)s;
            c.draw();
        }

}
