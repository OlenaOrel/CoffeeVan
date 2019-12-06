package ua.treining.model.entity.coffee;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class Coffee {

    private SortOfCoffee sort;

    public Coffee() {
    }

    public Coffee(SortOfCoffee sort) {
        this.sort = sort;
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
                "sort=" + sort +
                '}';
    }
}
