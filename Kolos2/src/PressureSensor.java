public class PressureSensor implements Sensor {
    @Override
    public double readValue() {
        return 1001;
    }

    @Override
    public String getStatus() {
        return "Pressure sensor active";
    }

    @Override
    public void reset() {
        System.out.println("Restarted!");
    }
}
