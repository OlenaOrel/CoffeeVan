package ua.training.version_2.model.entity.coffee;


public abstract class Coffee implements CoffeeImpl {

    private SortOfCoffee sort;

    @Override
    public SortOfCoffee sort() {
        return null;
    }

    public Coffee() {
    }

    public Coffee(SortOfCoffee sort) {
        this.sort = sort;
    }

    /**
     * getter, setter, toString
     */
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
