package ua.training.version_2.model.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.training.version_2.model.entities.coffee.Coffee;
import ua.training.version_2.model.entities.packaging.Packaging;

import java.math.BigDecimal;

/**
 * Created by Olena Orel on 14.12.2019.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CoffeeProduct {

    private Coffee coffee;
    private Packaging packaging;
    private int massOfCoffee;
    private int productMass;
    private BigDecimal price;

    public CoffeeProduct(Coffee coffee, Packaging packaging, BigDecimal price) {
        this.coffee = coffee;
        this.packaging = packaging;
        this.massOfCoffee = packaging.size();
        this.productMass = calculateProductMass();
        this.price = price;
    }

    // calculate price of one kg coffee
    public BigDecimal priceOfOneKgCoffee() {
        return BigDecimal.valueOf((price.doubleValue() * 1000) / packaging.size());
    }

    private int calculateProductMass() {
        return packaging.mass() + packaging.size();
    }


}
