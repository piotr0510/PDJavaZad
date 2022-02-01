package company;

import company.Human;
import devices.*;
import creatures.Animal;
import creatures.Pet;


public class Main {
    public static void main(String[] args) {


        Animal dog = new Pet("canis","Burek",50.0,9);
        Animal cat = new Pet("felis","Mruczek",5.0,5);


        dog.takeForWalk();
        dog.feed();
        cat.takeForWalk();
        cat.feed();

        Human me = new Human("Piotr", "Kowalski", 3600.0);
        Car car1 = new Electric("Golf5", "Red", 220, 15000.0);
        me.setSalary(-200.0);

        me.setSalary(3200.0);

        me.getSalary();

        Car chg = new Diesel("Lambo", "Black", 240,  6500.0);


        Human P1 = new Human("Paweł", "Sikora", 200.0);

        P1.setCar(chg);

        Human P2 = new Human("Klaudiusz","Męczek",1500.0);

        P2.setCar(chg);

        Human P3 = new Human("Mateusz", "Król", 1000000.0);

        P3.setCar(chg);

        Car carX = new LPG("AudiA4", "Red", 220, 2000.0);

        Car carY = new Diesel("AudiA5", "Green", 240, 1500.0);

        System.out.println("Print whole object:");
        System.out.println(carX);
        System.out.println(carY);

        System.out.println("\ndevices.Car comparison using '==' : result: "+ (carX == carY));

        System.out.println("devices.Car comparison using equals() - without override: was false");

        System.out.println("devices.Car comparison using equals() - after override: "+ carX.equals(carY));

        Phone phone = new Phone("abc", 9.0,"Android");

        System.out.println(cat);

        System.out.println(phone);

        System.out.println(chg);

        System.out.println(P3);

        phone.turnOn();

        carX.turnOn();

        Animal petForSale = new Pet("dog", "Max",50.0,3);

        Car carForSale = new Electric( "Maluch", "Purple", 160, 1000.0);

        Human buyer1 = new Human("Mariusz", "Kaczmarek", 3500.0);

        Human buyer2 = new Human("Damian", "Modrzew", 5500.0);

        Human seller1 = new Human("Damian", "Modrzew", 4000.0,petForSale);

        Human seller2 = new Human("Jan", "Kamień", 70000.0,carForSale);

        System.out.println("checking if the buyer has money");
        petForSale.sell(buyer1, seller1, 0.0);

        System.out.println("Before transaction:" +
                " Buyer cash: " + buyer1.getCash() + " Buyer animal: " + buyer1.pet +
                "Seller cash: " + seller1.getCash() + " Seller animal: " + seller1.pet);

        petForSale.sell(seller1, buyer1, 500.0);

        System.out.println("After transaction:" +
                " Buyer cash: " + buyer1.getCash() + " Buyer animal: " + buyer1.pet +
                " Seller cash: " + seller1.getCash() + " Seller animal: " + seller1.pet);



        carForSale.sell(seller2, buyer2, 0.0);

        System.out.println("Before transaction:" + " Buyer cash: " + buyer2.getCash() + " Buyer car: " + buyer2.getCar() +
                " Seller cash: " + seller2.getCash() + " Seller car: " + seller2.getCar());

        carForSale.sell(buyer2, seller2, 3000.0);

        System.out.println("After transaction:" + " Buyer cash: " + buyer2.getCash() + " Buyer car: " + buyer2.getCar() +
                " Seller cash: " + seller2.getCash() + " Seller car: " + seller2.getCar());

        carX.refuel();



    }
}