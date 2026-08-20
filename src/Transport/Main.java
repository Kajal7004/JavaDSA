package Transport;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4, 4, "Automatic");
        car.StartAC();

        MotorCycle motorcycle = new MotorCycle("Harley-Davidson", "Street 750", 2, "Drag Bar", "Telescopic Fork");
        motorcycle.wheelie();
    }
}
