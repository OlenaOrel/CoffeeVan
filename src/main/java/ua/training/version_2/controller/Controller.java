package ua.training.version_2.controller;

import ua.training.version_2.model.CoffeeVanUtility;
import ua.training.version_2.model.entities.CoffeeProduct;
import ua.training.version_2.model.entities.Van;
import ua.training.version_2.model.entities.coffee.Coffee;
import ua.training.version_2.model.entities.coffee.GrainCoffee;
import ua.training.version_2.model.entities.coffee.GroundCoffee;
import ua.training.version_2.model.entities.coffee.InstantCoffee;
import ua.training.version_2.model.entities.packaging.GlassPackage;
import ua.training.version_2.model.entities.packaging.Pack;
import ua.training.version_2.view.TextConstants;
import ua.training.version_2.view.View;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Controller {

    private Van van = new Van(6000, 2200, new ArrayList<>());

    private View view;
    private CoffeeVanUtility utility;

    public Controller(View view, CoffeeVanUtility utility) {
        this.view = view;
        this.utility = utility;
    }

    public void processVan() {
        loadCoffeeIntoVan();
        outputCoffeeFromVan(van.getProducts());
        outputSortedCoffeeFromVan(van.getProducts());
        outputGrainCoffee(van.getProducts());
        outputGroundCoffee(van.getProducts());
        outputInstantCoffee(van.getProducts());
        outputCoffeeInGlassPack(van.getProducts());
        outputCoffeeInPack(van.getProducts());
    }


    private void outputCoffeeInPack(List<CoffeeProduct> products) {
        Objects.requireNonNull(products);
        view.printMessage(TextConstants.FOUND_PRODUCT_IN_PACK);
        view.printProductList(utility.findCoffeeProductInPack(products));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void outputCoffeeInGlassPack(List<CoffeeProduct> products) {
        Objects.requireNonNull(products);
        view.printMessage(TextConstants.FOUND_PRODUCT_IN_GLASS_PACKAGE);
        view.printProductList(utility.findCoffeeProductInGlassPackaging(products));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void outputInstantCoffee(List<CoffeeProduct> products) {
        Objects.requireNonNull(products);
        view.printMessage(TextConstants.FOUND_INSTANT_COFFEE);
        view.printProductList(utility.findInstantCoffee(products));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void outputGroundCoffee(List<CoffeeProduct> products) {
        Objects.requireNonNull(products);
        view.printMessage(TextConstants.FOUND_GROUND_COFFEE);
        view.printProductList(utility.findGroundCoffee(products));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void outputGrainCoffee(List<CoffeeProduct> products) {
        Objects.requireNonNull(products);
        view.printMessage(TextConstants.FOUND_GRAIN_COFFEE);
        view.printProductList(utility.findGrainCoffee(products));
        view.printMessage(TextConstants.DELIMITER);
    }

    private void outputSortedCoffeeFromVan(List<CoffeeProduct> products) {
        Objects.requireNonNull(products);
        view.printMessage(TextConstants.SORTED_VAN_PRODUCTS);
        utility.sortByBestPrice(products);
        view.printProductList(products);
        view.printMessage(TextConstants.DELIMITER);
    }

    private void outputCoffeeFromVan(List<CoffeeProduct> products) {
        Objects.requireNonNull(products);
        view.printMessage(TextConstants.VAN_PRODUCTS);
        view.printProductList(products);
        view.printMessage(TextConstants.DELIMITER);

    }

    private void loadCoffeeIntoVan() {
        List<CoffeeProduct> tmp = van.getProducts();

        Pack pack50 = new Pack(15, 50);
        Pack pack100 = new Pack(25, 100);
        Pack pack200 = new Pack(30, 200);
        GlassPackage glass50 = new GlassPackage(150, 50);
        GlassPackage glass100 = new GlassPackage(250, 100);
        GlassPackage glass200 = new GlassPackage(370, 200);

        Coffee grainAr = new GrainCoffee(Coffee.SortOfCoffee.ARABICA, GrainCoffee.Roast.AMERICAN);
        Coffee grainC = new GrainCoffee(Coffee.SortOfCoffee.CANEPHORA, GrainCoffee.Roast.AMERICAN);

        Coffee groundA = new GroundCoffee(Coffee.SortOfCoffee.ARABICA, GroundCoffee.GrindingDegree.COURSE_GRIND);
        Coffee groundC = new GroundCoffee(Coffee.SortOfCoffee.CANEPHORA, GroundCoffee.GrindingDegree.FINE_GRIND);

        Coffee instantA = new InstantCoffee(Coffee.SortOfCoffee.CANEPHORA, InstantCoffee.TypeOfInstantCoffee.AGGLOMERATED);
        Coffee instantP = new InstantCoffee(Coffee.SortOfCoffee.CANEPHORA, InstantCoffee.TypeOfInstantCoffee.POWDERED);

        tmp.add(new CoffeeProduct(grainAr, glass50, new BigDecimal(60.0)));
        tmp.add(new CoffeeProduct(grainC, pack50, new BigDecimal(55.0)));
        tmp.add(new CoffeeProduct(grainAr, pack100, new BigDecimal(75.0)));
        tmp.add(new CoffeeProduct(grainC, glass100, new BigDecimal(80.0)));
        tmp.add(new CoffeeProduct(grainAr, pack200, new BigDecimal(100.0)));
        tmp.add(new CoffeeProduct(grainC, glass200, new BigDecimal(120.0)));
        tmp.add(new CoffeeProduct(groundA, pack50, new BigDecimal(65.0)));
        tmp.add(new CoffeeProduct(groundA, glass100, new BigDecimal(80.0)));
        tmp.add(new CoffeeProduct(groundA, pack200, new BigDecimal(100.0)));
        tmp.add(new CoffeeProduct(groundC, glass50, new BigDecimal(90.0)));
        tmp.add(new CoffeeProduct(groundC, pack100, new BigDecimal(75.0)));
        tmp.add(new CoffeeProduct(groundC, pack200, new BigDecimal(120.0)));
        tmp.add(new CoffeeProduct(instantA, glass50, new BigDecimal(80.0)));
        tmp.add(new CoffeeProduct(instantA, pack100, new BigDecimal(93.0)));
        tmp.add(new CoffeeProduct(instantA, glass200, new BigDecimal(150.0)));
        tmp.add(new CoffeeProduct(instantP, pack50, new BigDecimal(50.0)));
        tmp.add(new CoffeeProduct(instantP, glass100, new BigDecimal(62.0)));
        tmp.add(new CoffeeProduct(instantP, pack200, new BigDecimal(110.0)));
        tmp.add(new CoffeeProduct(grainC, glass50, new BigDecimal(72.0)));
        tmp.add(new CoffeeProduct(groundA, pack100, new BigDecimal(84.0)));
        tmp.add(new CoffeeProduct(instantA, pack200, new BigDecimal(125.0)));
        tmp.add(new CoffeeProduct(grainC, glass100, new BigDecimal(73.0)));
        tmp.add(new CoffeeProduct(instantP, pack100, new BigDecimal(68.0)));
        tmp.add(new CoffeeProduct(groundC, pack200, new BigDecimal(99.0)));
    }
}
