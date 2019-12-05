package ua.treining.model;

import ua.treining.model.entity.CoffeeProduct;
import ua.treining.model.entity.CoffeeProductComparator;
import ua.treining.model.entity.Packaging;
import ua.treining.model.entity.coffee.GrainCoffee;
import ua.treining.model.entity.coffee.GroundCoffee;
import ua.treining.model.entity.coffee.InstantCoffee;

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

    public CoffeeProduct findGrainCoffee(List<CoffeeProduct> products) {
        for (CoffeeProduct coffee : products) {
            if (coffee.getCoffee() instanceof GrainCoffee) {
                return coffee;
            }
        }
        return null;
    }

    public CoffeeProduct findInstantCoffee(List<CoffeeProduct> products) {
        for (CoffeeProduct coffee : products) {
            if (coffee.getCoffee() instanceof InstantCoffee) {
                return coffee;
            }
        }
        return null;
    }

    public CoffeeProduct findCoffeeProductByTypeOfPackaging(List<CoffeeProduct> products, Packaging packaging) {
        for (CoffeeProduct coffee : products) {
            if (coffee.getPackaging().equals(packaging)) {
                return coffee;
            }
        }
        return null;
    }



}
