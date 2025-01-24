public class TemperatureSensor implements Sensor {

    @Override
    public double readValue() {
        return 23.5;
    }

    @Override
    public String getStatus() {
        return "Active";
    }

    @Override
    public void reset() {
        System.out.println("Restarted!");
    }
}
