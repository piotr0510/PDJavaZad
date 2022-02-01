package devices;

public class Car extends Device{

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
    public void turnOn() {
        this.mode = "On";
        System.out.println(this.producer+" "+this.model+" starts working...");
    }



}
