public class Car implements VehicleManager{
    @Override
    public String startEngine() {
        return "Engine running";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}
