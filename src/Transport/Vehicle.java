package Transport;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    //Default Constructor
    public Vehicle() {
        System.out.println("Default Constructor called");
    }

    //parameterized constructor
    public Vehicle(String name, String model, int noOfTyres) {
        System.out.println("Parameterized Constructor called");
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public void startEngine() {
        System.out.println(name + " engine started.");
    }

    public void stopEngine() {
        System.out.println(name + " engine stopped.");
    }
}
