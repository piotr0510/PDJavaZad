
package devices;
import company.Human;
import company.Sellable;




public abstract class Device  {

    public String producer;

    public String mode;

    public int yearOfProduction;

    public abstract void turnOn();

    public String toString()
    {
        return producer + " " + mode + " " + yearOfProduction;
    }
}