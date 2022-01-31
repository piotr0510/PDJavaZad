public class Main {
    public static void main(String[] args) {


        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");
        dog.name = "Burek";
        dog.setWeight(50.0);
        dog.age = 9;
        cat.name = "Mruczek";
        cat.setWeight(5.0);
        cat.age = 5;

        dog.takeForWalk();
        dog.feed();
        cat.takeForWalk();
        cat.feed();

        Human me = new Human("Piotr", "Kowalski",3600.0);
        Car car1 = new Car("Golf5", "Red", 220, 15000.0);
        me.setSalary(-100.0);
        me.setSalary(3200.0);
        me.getSalary();

    }
}
