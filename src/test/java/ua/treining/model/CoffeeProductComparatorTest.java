package ua.treining.model;

import org.junit.Test;
import ua.treining.model.entity.CoffeeProduct;
import ua.treining.model.entity.CoffeeProductComparator;
import ua.treining.model.entity.Packaging;
import ua.treining.model.entity.coffee.Coffee;
import ua.treining.model.entity.coffee.SortOfCoffee;

import static org.junit.Assert.assertEquals;

public class CoffeeProductComparatorTest {

    private CoffeeProductComparator comparator = new CoffeeProductComparator();
    private CoffeeProduct product1 = new CoffeeProduct(100, Packaging.GLASS_LARGE, new Coffee(200, SortOfCoffee.ARABICA));
    private CoffeeProduct product2 = new CoffeeProduct(85, Packaging.PACK_LARGE, new Coffee(200, SortOfCoffee.ARABICA));
    private CoffeeProduct product3 = new CoffeeProduct(85, Packaging.PACK_LARGE, new Coffee(200, SortOfCoffee.ARABICA));

    @Test
    public void testCompareLess() {
        int result = comparator.compare(product1, product2);
        assertEquals(-1, result);
    }

    @Test
    public void testCompareMore() {
        int result = comparator.compare(product2, product1);
        assertEquals(1, result);
    }

    @Test
    public void testCompareEqual() {
        int result = comparator.compare(product2, product3);
        assertEquals(0, result);
    }
}
