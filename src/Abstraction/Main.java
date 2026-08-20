package Abstraction;

//  abstract class Bird {

//     abstract void fly();

//     abstract void eat();

//     public void sleep () {
//         System.out.println("bird is sleeping");
//     }
// }

// class Sparrow extends Bird  {
// @Override
//     void fly() {
//     System.out.println("Sparrow is flying" );
// }
// @Override
//     void eat() {
//     System.out.println("Sparrow is eating" );
// }
// }

// class Butterfly extends Bird  {
// @Override
//     void fly() {
//     System.out.println("Butterfly is flying" );
// }
// @Override
//     void eat() {
//     System.out.println("Butterfly is eating" );
// }
// }
// class Main {
//     public static void doBirdStuff(Bird b){
//         b.fly();
//         b.eat();
//         b.sleep();
//     }
//     public static void main (String[] args) {
//         // Bird b = new Sparrow();
//         // b.fly();
//         // b.eat();

//         // Bird b2 = new Butterfly();
//         // b2.fly();
//         // b2.eat();

//          doBirdStuff(new Sparrow());
//         doBirdStuff(new Butterfly());
//     }
// }


interface Bird {

     void fly();

     void eat();

     default void sleep() {
        System.out.println("Vird is sleeping");
     }
}
interface Walk {
    int legs = 4;
    void ByFeet();
}   

class Sparrow implements Bird, Walk  {
    @Override
    public void fly() {
    System.out.println("Sparrow is flying" );
}
    @Override
    public void eat() {
    System.out.println("Sparrow is eating" );
}
@Override
    public void ByFeet() {
        int a = Walk.legs;
    System.out.println("Sparrow is walking" );
}

}

class Butterfly implements Bird, Walk  {
@Override
   public void fly() {
    System.out.println("Butterfly is flying" );
}
@Override
   public void eat() {
    System.out.println("Butterfly is eating" );
}
@Override
    public void ByFeet() {
    System.out.println("Butterfly is walking" );
}
}
class Main {
    public static void doBirdStuff(Bird b, Walk w){
        b.fly();
        b.eat();
        b.sleep();
        w.ByFeet();
    }
    public static void main (String[] args) {
        // Bird b = new Sparrow();
        // b.fly();
        // b.eat();

        // Bird b2 = new Butterfly();
        // b2.fly();
        // b2.eat();

        
         doBirdStuff(new Sparrow(), new Sparrow());
        doBirdStuff(new Butterfly(), new Butterfly());
    }
}