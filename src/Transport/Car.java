package Transport;

public class Car extends Vehicle  {
    
    public int noOfDoors;
    public String TransmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String TransmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.TransmissionType = TransmissionType;
        super.startEngine();
        super.stopEngine();
    }

    public void StartAC() {
        System.out.println(name + " AC started.");
    }
}
