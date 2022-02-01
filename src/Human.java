import devices.Car;

public class Human {


    Animal pet;
    String firstName;
    String lastName;
    private Double salary;
    private Car car;
    private Double cash= 55000.0;

    public Human(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary= salary;


    }
    public Human(String firstName, String lastName, Double salary, Animal pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.pet = pet;
    }



    //ustawia nowe wynagrodzenie
    void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("ERROR");
        }
        if (salary > 0) {
            System.out.println("Księga została zaktualizowana");
            System.out.println("Prosze odebrać aneks od Pani Hani");
            System.out.println("Zus i US wiedzą o zmianie wypłaty");
            this.salary = salary;
        }

    }


    Double getSalary() {
        System.out.println("wynagrodzenie:" + this.salary);
        System.out.println(java.time.LocalDate.now());
        System.out.println("wynagrodzenie:");
        return this.salary;
    }
        public Car getCar()

        {
            return car;
        }

    public void setCar(Car car) {

        if (car == null) {
            this.car = null;
        }
        else

        if (this.salary > car.value) {
            this.car = car;
            System.out.println("Congratulations " + this.firstName + "! You bought " +  car.model + "for cash!");
        } else if (salary > car.value / 12) {
            this.car = car;
            System.out.println("Congratulations " + this.firstName + "! You bought " + car.model + " on instalments!");
        } else {
            System.out.println("Sorry " + this.firstName + " You are too poor.");
        }
        }
    public String toString() {
        return firstName + " " + lastName + " " + salary + " " + pet + " " + car;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }



    }

