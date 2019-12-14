package ua.training.version_1.model.entity.coffee;

/**
 * Class Coffee with String parameter roastOfCoffee
 * GrindCoffee has a superclass
 * @see Coffee
 *
 * Created by Olena Orel on 03.12.2019.
 */
public class GrainCoffee extends Coffee {

    /**
     * Parameter sortOfCoffee
     */
    private String roastOfCoffee;

    /**
     * Constructor without parameter
     */
    public GrainCoffee() {
    }

    /** Constructor with sortOfCoffee parameter from superclass and roastOfCoffee parameter */
    public GrainCoffee(SortOfCoffee sort, String roastOfCoffee) {
        super(sort);
        this.roastOfCoffee = roastOfCoffee;
    }

    /**
     * getter, setter, toString
     */
    public String getRoastOfCoffee() {
        return roastOfCoffee;
    }

    public void setRoastOfCoffee(String roastOfCoffee) {
        this.roastOfCoffee = roastOfCoffee;
    }

    @Override
    public String toString() {
        return "GrainCoffee{" +
                "roastOfCoffee='" + roastOfCoffee + '\'' +
                "} " + super.toString();
    }
}
