package devices;

import company.Human;
import company.Sellable;

public abstract class Car extends Device implements Sellable {

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
        System.out.println(this.producer + " " + this.model + " starts working...");
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car != this)
            System.out.println(seller.firstName + " doesn't  own this car.");
        else if (buyer.getCash() < price)
            System.out.println(buyer.firstName + " doesn't have enough money.");
        else {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash((seller.getCash() + price));
            seller.setCar(null);
            buyer.setCar(this);

            System.out.println("The transaction was successful!" + "Seller " + seller.firstName + " " + seller.lastName + " sold to "
                    + buyer.firstName + " " + buyer.lastName+ " " + this.model + " for a price " + price + ".");

        }



    }
    public abstract void refuel();
}