package ua.treining.model.entity;

import java.util.Comparator;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class CoffeeProductComparator implements Comparator<CoffeeProduct> {
    @Override
    public int compare(CoffeeProduct o1, CoffeeProduct o2) {
        if (o1.priceOfOneKgCoffee() > o2.priceOfOneKgCoffee()) {
            return -1;
        }
        if (o1.priceOfOneKgCoffee() < o2.priceOfOneKgCoffee()) {
            return 1;
        }
        return 0;
    }
}
