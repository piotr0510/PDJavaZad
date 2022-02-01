
package devices;
import src.Human;
import src.saleable;



public abstract class Device implements Sellable {

    public String producer;

    public String mode;

    public int yearOfProduction;

    public abstract void turnOn();

    public String toString()
    {
        return producer + " " + mode + " " + yearOfProduction;
    }
}