package ua.treining.model;

import ua.treining.model.entity.CoffeeProduct;
import ua.treining.model.entity.CoffeeProductComparator;
import ua.treining.model.entity.Packaging;
import ua.treining.model.entity.coffee.GrainCoffee;
import ua.treining.model.entity.coffee.GroundCoffee;
import ua.treining.model.entity.coffee.InstantCoffee;

import java.util.List;

/**
 * Class sorted products from Van list, found product by types of Coffee and types of packaging
 *
 * Created by Olena Orel on 03.12.2019.
 */
public class CoffeeVanUtility {

    /**
     * Method sorted CoffeeProduct base on price and weight
     *
     * @param products Van list
     * @return products sorted by best price
     * @see CoffeeProductComparator
     */
    public List<CoffeeProduct> sortByBestPrice(List<CoffeeProduct> products) {
        products.sort(new CoffeeProductComparator());
        return products;
    }

    /**
     * Method found GroundCoffee type of CoffeeProduct from Van list
     *
     * @param products Van list
     * @return coffee
     * @see GroundCoffee
     */
    public CoffeeProduct findGroundCoffee(List<CoffeeProduct> products) {
        for (CoffeeProduct coffee : products) {
            if (coffee.getCoffee() instanceof GroundCoffee) {
                return coffee;
            }
        }
        return null;
    }

    /** Method found GrainCoffee type of CoffeeProduct from Van list
     * @see GrainCoffee
     * @param products Van list
     * @return coffee
     */
    public CoffeeProduct findGrainCoffee(List<CoffeeProduct> products) {
        for (CoffeeProduct coffee : products) {
            if (coffee.getCoffee() instanceof GrainCoffee) {
                return coffee;
            }
        }
        return null;
    }

    /** Method found InstantCoffee type of CoffeeProduct from Van list
     * @see InstantCoffee
     * @param products Van list
     * @return coffee
     */
    public CoffeeProduct findInstantCoffee(List<CoffeeProduct> products) {
        for (CoffeeProduct coffee : products) {
            if (coffee.getCoffee() instanceof InstantCoffee) {
                return coffee;
            }
        }
        return null;
    }

    /** Method found CoffeeProduct by type of packaging from Van list
     * @see Packaging
     * @param products Van list
     * @return coffee
     */
    public CoffeeProduct findCoffeeProductByTypeOfPackaging(List<CoffeeProduct> products, Packaging packaging) {
        for (CoffeeProduct coffee : products) {
            if (coffee.getPackaging().equals(packaging)) {
                return coffee;
            }
        }
        return null;
    }



}
