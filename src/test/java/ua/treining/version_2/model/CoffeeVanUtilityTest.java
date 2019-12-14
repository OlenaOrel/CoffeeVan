package ua.treining.version_2.model;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.training.version_2.model.CoffeeVanUtility;
import ua.training.version_2.model.entities.CoffeeProduct;
import ua.training.version_2.model.entities.coffee.Coffee;
import ua.training.version_2.model.entities.coffee.GrainCoffee;
import ua.training.version_2.model.entities.coffee.GroundCoffee;
import ua.training.version_2.model.entities.coffee.InstantCoffee;
import ua.training.version_2.model.entities.packaging.GlassPackage;
import ua.training.version_2.model.entities.packaging.Pack;
import ua.training.version_2.model.entities.packaging.Packaging;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoffeeVanUtilityTest {

    private static CoffeeVanUtility utility;
    private static List<CoffeeProduct> products = new ArrayList<>();
    private static CoffeeProduct firstElement;
    private static CoffeeProduct lastElement;
    private static List<CoffeeProduct> grainCoffee = new ArrayList<>();
    private static List<CoffeeProduct> instantCoffee = new ArrayList<>();
    private static List<CoffeeProduct> groundCoffee = new ArrayList<>();
    private static Packaging glassPackage;
    private static Packaging pack;
    private static Coffee instant;
    private static Coffee ground;
    private static Coffee grain;

    @BeforeClass
    public static void before() {
        utility = new CoffeeVanUtility();

        glassPackage = new GlassPackage(150, 50);
        pack = new Pack(15, 50);

        firstElement = new CoffeeProduct(new InstantCoffee(Coffee.SortOfCoffee.ARABICA, InstantCoffee.TypeOfInstantCoffee.AGGLOMERATED),
                pack, new BigDecimal(30.0));
        lastElement = new CoffeeProduct(new GroundCoffee(Coffee.SortOfCoffee.ARABICA, GroundCoffee.GrindingDegree.COURSE_GRIND),
                glassPackage, new BigDecimal(150.0));

        instant = new InstantCoffee(Coffee.SortOfCoffee.ARABICA, InstantCoffee.TypeOfInstantCoffee.AGGLOMERATED);
        ground = new GroundCoffee(Coffee.SortOfCoffee.ARABICA, GroundCoffee.GrindingDegree.COURSE_GRIND);
        grain = new GrainCoffee(Coffee.SortOfCoffee.ARABICA, GrainCoffee.Roast.AMERICAN);

        grainCoffee.add(new CoffeeProduct(grain, glassPackage, new BigDecimal(70)));
        grainCoffee.add(new CoffeeProduct(grain, pack, new BigDecimal(80.0)));

        instantCoffee.add(firstElement);
        instantCoffee.add(new CoffeeProduct(instant, pack, new BigDecimal(50.0)));
        instantCoffee.add(new CoffeeProduct(instant, glassPackage, new BigDecimal(65.0)));

        groundCoffee.add(new CoffeeProduct(ground, glassPackage, new BigDecimal(95)));
        groundCoffee.add(new CoffeeProduct(ground, pack, new BigDecimal(100.0)));
        groundCoffee.add(lastElement);

        products.addAll(groundCoffee);
        products.addAll(instantCoffee);
        products.addAll(grainCoffee);
    }

    @Test
    public void sortByBestPriceTest() {
        List<CoffeeProduct> result = utility.sortByBestPrice(products);
        assertEquals(firstElement, result.get(0));
        assertEquals(lastElement, result.get(result.size() - 1));
    }

    @Test
    public void findGroundCoffeeTest() {
        List<CoffeeProduct> result = utility.findGroundCoffee(products);
        assertEquals(groundCoffee.get(0), result.get(0));
        assertEquals(groundCoffee.get(1), result.get(1));
        assertEquals(groundCoffee.get(2), result.get(2));
    }

    @Test
    public void findGrainCoffeeTest() {
        List<CoffeeProduct> result = utility.findGrainCoffee(products);
        assertEquals(grainCoffee.get(0), result.get(0));
        assertEquals(grainCoffee.get(1), result.get(1));
    }

    @Test
    public void findInstantCoffeeTest() {
        List<CoffeeProduct> result = utility.findInstantCoffee(products);
        assertEquals(instantCoffee.get(0), result.get(0));
        assertEquals(instantCoffee.get(1), result.get(1));
        assertEquals(instantCoffee.get(2), result.get(2));
    }

    @Test
    public void findCoffeeProductInGlassPackagingTest() {
        List<CoffeeProduct> result = utility.findCoffeeProductInGlassPackaging(products);
        assertEquals(new CoffeeProduct(instant, glassPackage, new BigDecimal(65.0)), result.get(0));
        assertEquals(lastElement, result.get(3));

    }

    @Test
    public void findCoffeeProductInPackTest() {
        List<CoffeeProduct> result = utility.findCoffeeProductInPack(products);
        assertEquals(firstElement, result.get(0));
        assertEquals(new CoffeeProduct(ground, pack, new BigDecimal(100.0)), result.get(3));
    }

}
