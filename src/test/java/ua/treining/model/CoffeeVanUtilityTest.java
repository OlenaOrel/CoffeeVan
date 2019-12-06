package ua.treining.model;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.treining.model.entity.CoffeeProduct;
import ua.treining.model.entity.Packaging;
import ua.treining.model.entity.coffee.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class CoffeeVanUtilityTest {

    private static CoffeeVanUtility utility;
    private static List<CoffeeProduct> products = new ArrayList<>();
    private static CoffeeProduct firstElement;
    private static CoffeeProduct lastElement;
    private static CoffeeProduct grainCoffee;
    private static CoffeeProduct instantCoffee;
    private static CoffeeProduct groundCoffee;


    @BeforeClass
    public static void before() {
        utility = new CoffeeVanUtility();
        firstElement = new CoffeeProduct(75, Packaging.PACK_LARGE, new Coffee(SortOfCoffee.ARABICA));
        lastElement = new CoffeeProduct(180, Packaging.GLASS_MEDIUM, new Coffee(SortOfCoffee.ARABICA));
        instantCoffee = new CoffeeProduct(45, Packaging.PACK_SMALL, new InstantCoffee(SortOfCoffee.ARABICA, "granular"));
        grainCoffee = new CoffeeProduct(105, Packaging.PACK_LARGE, new GrainCoffee(SortOfCoffee.CANEPHORA, "French"));
        groundCoffee = new CoffeeProduct(125, Packaging.GLASS_LARGE, new GroundCoffee(SortOfCoffee.ARABICA, GrindingDegree.MEDIUM_GRIND));
        products.add(new CoffeeProduct(120, Packaging.GLASS_MEDIUM, new Coffee(SortOfCoffee.CANEPHORA)));
        products.add(new CoffeeProduct(60, Packaging.GLASS_SMALL, new Coffee(SortOfCoffee.ARABICA)));
        products.add(new CoffeeProduct(80, Packaging.PACK_MEDIUM, new Coffee(SortOfCoffee.CANEPHORA)));
        products.add(grainCoffee);
        products.add(instantCoffee);
        products.add(groundCoffee);
        products.add(lastElement);
        products.add(firstElement);
    }

    @Test
    public void sortByBestPriceTest() {
        List<CoffeeProduct> result = utility.sortByBestPrice(products);
        assertEquals(firstElement, result.get(0));
        assertEquals(lastElement, result.get(result.size() - 1));
    }

    @Test
    public void findGroundCoffeeTest() {
        CoffeeProduct result = utility.findGroundCoffee(products);
        assertEquals(groundCoffee, result);
    }

    @Test
    public void findGrainCoffeeTest() {
        CoffeeProduct result = utility.findGrainCoffee(products);
        assertEquals(grainCoffee, result);
    }

    @Test
    public void findInstantCoffeeTest() {
        CoffeeProduct result = utility.findInstantCoffee(products);
        assertEquals(instantCoffee, result);
    }

    @Test
    public void findCoffeeProductByTypeOfPackagingTest() {
        CoffeeProduct result = utility.findCoffeeProductByTypeOfPackaging(products, Packaging.PACK_SMALL);
        assertEquals(instantCoffee, result);
    }
}
