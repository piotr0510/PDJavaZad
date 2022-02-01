package devices;
import devices.Car;

public class Diesel extends Car
    {
    public Diesel(String model, String color, Integer Speed, Double value)
    {
        super(model,color , Speed, value);
    }

        public void refuel()
        {
        System.out.println("Diesel filled up");
    }

}
