package Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();

        Vehicle vCar = new Car();
        //Car cVehicle = (Car) new Vehicle(); -> This will throw error
        castTest(c); // Possible because car is a child of vehicle.

        Object ref = new Vehicle(); // Object class is a parent of every class hence it is possible
    }

    private static void castTest(Vehicle veh){
        veh.start();
    }
}
