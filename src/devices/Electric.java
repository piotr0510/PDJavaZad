package devices;

public class Electric extends Car
{
    public Electric(String model, String color, Integer Speed, Double value)
    {
        super(model,color , Speed, value);
    }

        public void refuel()
        {
            System.out.println("Electric filled up");
        }
}
