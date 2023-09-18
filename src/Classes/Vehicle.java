package Classes;

public class Vehicle {
    private String type;
    private String model;
    private int fuel;

    public Vehicle(String type, String model, Engine engine, int fuel) {
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    private Engine engine;

    public static class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }
    }


    public void drive(int fuelLoss) {
        this.fuel -= fuelLoss;
    }


    public static void main(String[] args) {
        Engine engine = new Engine(100);
        Vehicle vehicle = new Vehicle("Mercedes", "CLS", engine, 200);
        vehicle.drive(99);
        System.out.println(vehicle.fuel);
    }

}
