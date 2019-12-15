package ua.training.version_2.model;


import ua.training.version_2.model.entity.CoffeeProduct;
import ua.training.version_2.model.entity.coffee.GrainCoffee;
import ua.training.version_2.model.entity.coffee.GroundCoffee;
import ua.training.version_2.model.entity.coffee.InstantCoffee;
import ua.training.version_2.model.entity.packaging.GlassPackage;
import ua.training.version_2.model.entity.packaging.Pack;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Olena Orel on 14.12.2019.
 */
public class CoffeeVanUtility {

    public List<CoffeeProduct> sortByBestPrice(List<CoffeeProduct> products) {
        products.sort(Comparator.comparing(CoffeeProduct::priceOfOneKgCoffee));
        return products;
    }

    public List<CoffeeProduct> findGroundCoffee(List<CoffeeProduct> products) {
        return products.stream().filter(
                coffeeProduct -> coffeeProduct.getCoffee() instanceof GroundCoffee)
                .collect(Collectors.toList());
    }

    public List<CoffeeProduct> findGrainCoffee(List<CoffeeProduct> products) {
        return products.stream().filter(coffeeProduct ->
                coffeeProduct.getCoffee() instanceof GrainCoffee)
                .collect(Collectors.toList());
    }

    public List<CoffeeProduct> findInstantCoffee(List<CoffeeProduct> products) {
        return products.stream().filter(coffeeProduct ->
                coffeeProduct.getCoffee() instanceof InstantCoffee)
                .collect(Collectors.toList());
    }

    public List<CoffeeProduct> findCoffeeProductInGlassPackaging(List<CoffeeProduct> products) {
        return products.stream().filter(coffeeProduct ->
                coffeeProduct.getPackaging() instanceof GlassPackage)
                .collect(Collectors.toList());
    }

    public List<CoffeeProduct> findCoffeeProductInPack(List<CoffeeProduct> products) {
        return products.stream().filter(coffeeProduct ->
                coffeeProduct.getPackaging() instanceof Pack)
                .collect(Collectors.toList());
    }

}
