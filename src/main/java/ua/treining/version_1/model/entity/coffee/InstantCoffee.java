package ua.treining.version_1.model.entity.coffee;

/**
 * Class Coffee with String parameter typeOfInstantCoffee
 * InstantCoffee has a superclass
 * @see Coffee
 *
 * Created by Olena Orel on 03.12.2019.
 */
public class InstantCoffee extends Coffee {

    /**
     * Parameter typeOfInstantCoffee
     */
    private String typeOfInstantCoffee;

    /**
     * Constructor without parameter
     */
    public InstantCoffee() {
    }

    /** Constructor with sortOfCoffee parameter from superclass and roastOfCoffee parameter */
    public InstantCoffee(SortOfCoffee sort, String typeOfInstantCoffee) {
        super(sort);
        this.typeOfInstantCoffee = typeOfInstantCoffee;
    }

    /**
     * getter, setter, toString
     */
    public String getTypeOfInstantCoffee() {
        return typeOfInstantCoffee;
    }

    public void setTypeOfInstantCoffee(String typeOfInstantCoffee) {
        this.typeOfInstantCoffee = typeOfInstantCoffee;
    }

    @Override
    public String toString() {
        return "InstantCoffee{" +
                "typeOfInstantCoffee='" + typeOfInstantCoffee + '\'' +
                "} " + super.toString();
    }
}
