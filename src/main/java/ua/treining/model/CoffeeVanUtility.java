package ua.treining.model;

import ua.treining.model.entity.CoffeeProduct;
import ua.treining.model.entity.CoffeeProductComparator;
import ua.treining.model.entity.coffee.GroundCoffee;

import java.util.List;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class CoffeeVanUtility {

    public List<CoffeeProduct> sortByBestPrice(List<CoffeeProduct> products) {
        products.sort(new CoffeeProductComparator());
        return products;
    }

    public CoffeeProduct findGroundCoffee(List<CoffeeProduct> products) {
        for (CoffeeProduct coffee : products) {
            if (coffee.getCoffee() instanceof GroundCoffee) {
                return coffee;
            }
        }
        return null;
    }

}
