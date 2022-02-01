package creatures;
import  creatures.Animal;

public class FarmAnimal extends Animal implements Edible
{

    public void beEaten() {

        System.out.println("That was a tasty farm animal" + this.species + " " + this.name + ".");
    }

    public FarmAnimal(String species, String name, Double weight, Integer age)
    {
        super(species, name, weight, age);

    }
}
