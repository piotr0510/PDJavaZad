package devices;

public class Car {

    final public String model;
    public String color;
    public int Speed;
    public Double value;



   public Car(String model, String color, Integer speed, Double value) {
        this.model = model;
        this.color = color;
        this.Speed = speed;
        this.value = value;
    }




    public String toString() {
        return Speed + " " + model + " " + value + " " + color;
    }



}
