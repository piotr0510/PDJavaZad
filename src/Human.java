public class Human {


    Animal pet;
    String firstName;
    String lastName;
    private Double salary;

    public Human(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary= salary;


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



}
