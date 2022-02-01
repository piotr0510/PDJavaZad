package devices;

public class LPG extends Car
{
    public LPG(String model, String color, Integer Speed, Double value)
    {
        super(model,color , Speed, value);
    }
    public void refuel()
    {
        System.out.println("LPG filled up");
    }
}
