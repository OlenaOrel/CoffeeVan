package ua.treining.model.entity.coffee;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class InstantCoffee extends Coffee {

    private String typeOfInstantCoffee;

    public InstantCoffee() {
    }

    public InstantCoffee(String typeOfInstantCoffee) {
        this.typeOfInstantCoffee = typeOfInstantCoffee;
    }

    public InstantCoffee(SortOfCoffee sort, String typeOfInstantCoffee) {
        super(sort);
        this.typeOfInstantCoffee = typeOfInstantCoffee;
    }

    @Override
    public String toString() {
        return "InstantCoffee{" +
                "typeOfInstantCoffee='" + typeOfInstantCoffee + '\'' +
                "} " + super.toString();
    }
}
