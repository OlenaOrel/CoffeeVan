package ua.training.version_1.model.entity.coffee;

/**
 * Class Coffee with enum types parameter SortOfCoffee
 * Coffee is a superclass
 * @see GrainCoffee
 * @see GroundCoffee
 * @see InstantCoffee
 *
 * Created by Olena Orel on 03.12.2019.
 */
public class Coffee {

    /**
     * Parameter sortOfCoffee
     */
    private SortOfCoffee sort;

    /**
     * Constructor without parameter
     */
    public Coffee() {
    }

    /** Constructor with sortOfCoffee parameter */
    public Coffee(SortOfCoffee sort) {
        this.sort = sort;
    }

    /** getter, setter, toString */
    public SortOfCoffee getSort() {
        return sort;
    }

    public void setSort(SortOfCoffee sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "sort=" + sort +
                '}';
    }
}
