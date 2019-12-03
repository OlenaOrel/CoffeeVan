package ua.treining.model.entity;


import ua.treining.model.entity.coffee.Coffee;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class CoffeeProduct {

    private Packaging packaging;
    private Coffee coffee;

    public CoffeeProduct() {
    }

    public CoffeeProduct(Packaging packaging, Coffee coffee) {
        this.packaging = packaging;
        this.coffee = coffee;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "CoffeeProduct{" +
                "packaging=" + packaging +
                ", coffee=" + coffee +
                '}';
    }
}
