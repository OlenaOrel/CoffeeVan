package ua.treining.controller;

import ua.treining.model.CoffeeVanUtility;
import ua.treining.model.entity.CoffeeProduct;
import ua.treining.model.entity.Packaging;
import ua.treining.model.entity.Van;
import ua.treining.model.entity.coffee.*;
import ua.treining.view.TextConstants;
import ua.treining.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class Controller {

    private View view;
    private CoffeeVanUtility utility;
    private Van van = new Van(6000, 2200, new ArrayList<>());

    public Controller(View view, CoffeeVanUtility utility) {
        this.view = view;
        this.utility = utility;
    }

    public void processVan() {
        loadCoffeeIntoVan();
        outputCoffeeFromVan();
        outputSortedCoffeeFromVan();
        getAndOutputGrainCoffee();
        getAndOutputGroundCoffee();
        getAndOutputInstantCoffee();
        getAndOutputCoffeeInGlassPack();
        getAndOutputCoffeeInPack();
    }

    private void getAndOutputCoffeeInPack() {
        view.printMessage(TextConstants.FOUND_PRODUCT_IN_PACK);
        view.printProduct(utility.findCoffeeProductByTypeOfPackaging(van.getProducts(), Packaging.PACK_MEDIUM));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void getAndOutputCoffeeInGlassPack() {
        view.printMessage(TextConstants.FOUND_PRODUCT_IN_GLASS_PACKAGE);
        view.printProduct(utility.findCoffeeProductByTypeOfPackaging(van.getProducts(), Packaging.GLASS_MEDIUM));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void getAndOutputInstantCoffee() {
        view.printMessage(TextConstants.FOUND_INSTANT_COFFEE);
        view.printProduct(utility.findInstantCoffee(van.getProducts()));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void getAndOutputGroundCoffee() {
        view.printMessage(TextConstants.FOUND_GROUND_COFFEE);
        view.printProduct(utility.findGroundCoffee(van.getProducts()));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void getAndOutputGrainCoffee() {
        view.printMessage(TextConstants.FOUND_GRAIN_COFFEE);
        view.printProduct(utility.findGrainCoffee(van.getProducts()));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void outputSortedCoffeeFromVan() {
        view.printMessage(TextConstants.SORTED_VAN_PRODUCTS);
        utility.sortByBestPrice(van.getProducts());
        view.printProductList(van.getProducts());
        view.printMessage(TextConstants.DELIMITER);
    }

    private void outputCoffeeFromVan() {
        view.printMessage(TextConstants.VAN_PRODUCTS);
        view.printProductList(van.getProducts());
        view.printMessage(TextConstants.DELIMITER);

    }

    private void loadCoffeeIntoVan() {
        List<CoffeeProduct> tmp = van.getProducts();
        tmp.add(new CoffeeProduct(100, Packaging.GLASS_LARGE, new Coffee(SortOfCoffee.ARABICA)));
        tmp.add(new CoffeeProduct(80, Packaging.GLASS_MEDIUM, new Coffee(SortOfCoffee.CANEPHORA)));
        tmp.add(new CoffeeProduct(65, Packaging.GLASS_SMALL, new Coffee(SortOfCoffee.ARABICA)));
        tmp.add(new CoffeeProduct(85, Packaging.PACK_LARGE, new Coffee(SortOfCoffee.CANEPHORA)));
        tmp.add(new CoffeeProduct(60, Packaging.PACK_MEDIUM, new Coffee(SortOfCoffee.ARABICA)));
        tmp.add(new CoffeeProduct(45, Packaging.PACK_SMALL, new Coffee(SortOfCoffee.CANEPHORA)));
        tmp.add(new CoffeeProduct(150, Packaging.GLASS_LARGE, new GrainCoffee(SortOfCoffee.CANEPHORA, "French")));
        tmp.add(new CoffeeProduct(100, Packaging.GLASS_MEDIUM, new GrainCoffee(SortOfCoffee.ARABICA, "Spanish")));
        tmp.add(new CoffeeProduct(95, Packaging.GLASS_SMALL, new GrainCoffee(SortOfCoffee.ARABICA, "American")));
        tmp.add(new CoffeeProduct(75, Packaging.PACK_SMALL, new GrainCoffee(SortOfCoffee.CANEPHORA, "French")));
        tmp.add(new CoffeeProduct(97, Packaging.PACK_MEDIUM, new GrainCoffee(SortOfCoffee.ARABICA, "American")));
        tmp.add(new CoffeeProduct(120, Packaging.PACK_LARGE, new GrainCoffee(SortOfCoffee.CANEPHORA, "French")));
        tmp.add(new CoffeeProduct(135, Packaging.GLASS_LARGE, new GroundCoffee(SortOfCoffee.ARABICA, GrindingDegree.MEDIUM_GRIND)));
        tmp.add(new CoffeeProduct(87, Packaging.GLASS_MEDIUM, new GroundCoffee(SortOfCoffee.CANEPHORA, GrindingDegree.COURSE_GRIND)));
        tmp.add(new CoffeeProduct(75, Packaging.GLASS_SMALL, new GroundCoffee(SortOfCoffee.ARABICA, GrindingDegree.FINE_GRIND)));
        tmp.add(new CoffeeProduct(120, Packaging.PACK_LARGE, new GroundCoffee(SortOfCoffee.ARABICA, GrindingDegree.PULVERIZED)));
        tmp.add(new CoffeeProduct(100, Packaging.PACK_MEDIUM, new GroundCoffee(SortOfCoffee.CANEPHORA, GrindingDegree.PULVERIZED)));
        tmp.add(new CoffeeProduct(67, Packaging.PACK_SMALL, new GroundCoffee(SortOfCoffee.ARABICA, GrindingDegree.PULVERIZED)));
        tmp.add(new CoffeeProduct(150, Packaging.GLASS_LARGE, new InstantCoffee(SortOfCoffee.CANEPHORA, "granular")));
        tmp.add(new CoffeeProduct(65, Packaging.GLASS_MEDIUM, new InstantCoffee(SortOfCoffee.CANEPHORA, "granular")));
        tmp.add(new CoffeeProduct(100, Packaging.GLASS_SMALL, new InstantCoffee(SortOfCoffee.CANEPHORA, "granular")));
        tmp.add(new CoffeeProduct(80, Packaging.PACK_LARGE, new InstantCoffee(SortOfCoffee.CANEPHORA, "granular")));
        tmp.add(new CoffeeProduct(65, Packaging.PACK_MEDIUM, new InstantCoffee(SortOfCoffee.CANEPHORA, "granular")));
        tmp.add(new CoffeeProduct(40, Packaging.PACK_SMALL, new InstantCoffee(SortOfCoffee.CANEPHORA, "granular")));
    }

}
