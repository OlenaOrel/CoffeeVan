package ua.treining.model;

import ua.treining.model.entity.CoffeeProduct;
import ua.treining.model.entity.Packaging;
import ua.treining.model.entity.coffee.GrainCoffee;
import ua.treining.model.entity.coffee.GroundCoffee;
import ua.treining.model.entity.coffee.InstantCoffee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
     */
    public List<CoffeeProduct> sortByBestPrice(List<CoffeeProduct> products) {
        products.sort(Comparator.comparingInt(CoffeeProduct::priceOfOneKgCoffee));
        return products;
    }

    /**
     * Method found GroundCoffee type of CoffeeProduct from Van list
     * @see GroundCoffee
     * @param products Van list
     * @return coffee
     */
    public List<CoffeeProduct> findGroundCoffee(List<CoffeeProduct> products) {
        return products.stream().filter(
                coffeeProduct -> coffeeProduct.getCoffee() instanceof GroundCoffee)
                .collect(Collectors.toList());
    }

    /** Method found GrainCoffee type of CoffeeProduct from Van list
     * @see GrainCoffee
     * @param products Van list
     * @return list coffeeProducts
     */
    public List<CoffeeProduct> findGrainCoffee(List<CoffeeProduct> products) {
        return products.stream().filter(coffeeProduct ->
                coffeeProduct.getCoffee() instanceof GrainCoffee)
                .collect(Collectors.toList());
    }

    /** Method found InstantCoffee type of CoffeeProduct from Van list
     * @see InstantCoffee
     * @param products Van list
     * @return list coffeeProducts
     */
    public List<CoffeeProduct> findInstantCoffee(List<CoffeeProduct> products) {
        return products.stream().filter(coffeeProduct ->
                coffeeProduct.getCoffee() instanceof InstantCoffee)
                .collect(Collectors.toList());
    }

    /** Method found CoffeeProduct by type of packaging from Van list
     * @see Packaging
     * @param products Van list
     * @return list coffeeProducts
     */
    public List<CoffeeProduct> findCoffeeProductByTypeOfPackaging(List<CoffeeProduct> products, Packaging packaging) {
        return products.stream().filter(coffeeProduct ->
                coffeeProduct.getPackaging().equals(packaging))
                .collect(Collectors.toList());
    }



}
