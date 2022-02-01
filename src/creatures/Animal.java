package creatures;
import company.Sellable;
import company.Human;
import company.Main;


public abstract class Animal implements Sellable,Feedable {
    String species;
    public String name;
    Double weight;
    public Integer age;
    Boolean alive = true;

     public Animal(String species, String name, Double weight, Integer age) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.age = age;

    }
    public  Animal(String species) {
        this.species = species;
        this.alive = true;
        if (species == "canis")
            this.weight = 10.0;
        if (species == "felis")
            this.weight = 2.0;
        else
            this.weight = 1.0;
    }
    public Double getWeight() {
        return this.weight;
    }
    public void setWeight(Double weight) {
        if (weight > 0) {this.weight = weight;}
        else {System.out.println("ERROR");}
    }
    public void feed()
    {

    }

    public void feed(double foodWeight) {
        if (this.alive) weight = weight + foodWeight/3;
        else {

            System.out.println("creatures.Animal is dead, how you want to feed him?");
        }

    }
    public void takeForWalk() {
        if (this.alive) {
            weight = weight- 1.0;
            if (weight<=0.0) {
                System.out.print("Your animal has died");
                this.alive = false;}
        }
        else {
            System.out.println("Your animal is dead, how you want to take him for a walk, you can try but that would look werid.");
        }
    }
    public String toString(){
        return species + " " + name + " " + weight+ "" + age ;
    }



    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this)
            System.out.println(seller.firstName + " doesn't  own this animal.");
        else if (buyer.getCash() < price)
            System.out.println(buyer.firstName + " doesn't have enough money.");

        else {

            buyer.setCash(buyer.getCash() - price);
            seller.setCash((seller.getCash() + price));
            seller.pet = null;
            buyer.pet = this;


            System.out.println("The transaction was successful!" + "Seller " + seller.firstName + " " + seller.lastName + " sold to "
                    + buyer.firstName + " " + buyer.lastName + " animal species " + this.species + " named " + this.name + " for a price " + price + ".");

        }
    }



}
