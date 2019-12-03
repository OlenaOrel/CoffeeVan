package ua.treining.model.entity.coffee;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class Coffee {

    private double mass;
    private SortOfCoffee sort;

    public Coffee() {
    }

    public Coffee(double mass, SortOfCoffee sort) {
        this.mass = mass;
        this.sort = sort;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public SortOfCoffee getSort() {
        return sort;
    }

    public void setSort(SortOfCoffee sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "mass=" + mass +
                ", sort=" + sort +
                '}';
    }
}
