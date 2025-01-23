import java.util.Objects;

public class Computer {
    private String brand;
    private String model;
    private Processor processor;

    public Computer(String brand, String model, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, processor);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor=" + processor +
                '}';
    }
}
