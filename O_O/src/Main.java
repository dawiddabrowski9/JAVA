
public class Main {
    public static void main(String[] args) {
        VehicleManager car = new Car();
        VehicleManager motorcycle = new Motorcycle();


        System.out.println("Test Car:");
        System.out.println(car.startEngine());
        System.out.println("Poziom paliwa: " + car.getFuelLevel());


        System.out.println("\nTest Motorcycle:");
        System.out.println(motorcycle.startEngine());
        System.out.println("Poziom paliwa: " + motorcycle.getFuelLevel());

    }
}