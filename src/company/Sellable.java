package company;

import company.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, Double price);
}
