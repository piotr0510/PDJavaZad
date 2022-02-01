package devices;

public class Phone  {

    final public String model;
    final public Double screenSize;
    final public String operatingSystem;
    public Phone(String model, Double screenSize, String operatingSystem)
    {
        this.model = model;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return model + " " + screenSize + " " + operatingSystem;
    }
}