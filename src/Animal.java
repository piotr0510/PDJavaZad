public class Animal {
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive = true;

    Animal(String species, String name, Double weight, Integer age, Boolean alive) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.alive = alive;
    }
    Animal(String species) {
        this.species = species;
        this.alive = true;
        if (species == "canis")
            this.weight = 10.0;
        if (species == "felis")
            this.weight = 2.0;
        else
            this.weight = 1.0;
    }
    Double getWeight() {
        return this.weight;
    }
    void setWeight(Double weight) {
        if (weight > 0) {this.weight = weight;}
        else {System.out.println("ERROR");}
    }
    void feed() {
        if (this.alive) weight = weight + 1.0;
        else {

            System.out.println("Animal is dead, how you want to feed him?");
        }
    }
    void takeForWalk() {
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

}
