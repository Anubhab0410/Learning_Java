class Vehicle {
    public void startEngine() {
        System.out.println("Starting the vehicle's engine");
    }
    public void stopEngine() {
        System.out.println("Stopping the vehicle's engine");
    }
}
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine");
    }
    @Override
    public void stopEngine() {
        System.out.println("Stopping the car's engine");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine");
    }
    @Override
    public void stopEngine() {
        System.out.println("Stopping the motorcycle's engine");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();
        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}


