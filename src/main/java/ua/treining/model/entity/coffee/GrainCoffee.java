package ua.treining.model.entity.coffee;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class GrainCoffee extends Coffee {

    private String roastOfCoffee;

    public GrainCoffee() {
    }

    public GrainCoffee(String roastOfCoffee) {
        this.roastOfCoffee = roastOfCoffee;
    }

    public GrainCoffee(double mass, SortOfCoffee sort, String roastOfCoffee) {
        super(mass, sort);
        this.roastOfCoffee = roastOfCoffee;
    }
}
