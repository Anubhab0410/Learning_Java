interface Motor {
    int capacity = 10; 
    void run();
    void consume();
}

class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing Machine is running...");
    }
    @Override
    public void consume() {
        System.out.println("Power consumption: 500W per cycle.");
    }
    void showCapacity() {
        System.out.println("Washing Machine Capacity: " + capacity + " liters.");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.showCapacity(); // Accessing capacity value
    }
}