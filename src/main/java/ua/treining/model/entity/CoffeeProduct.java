package ua.treining.model.entity;


import ua.treining.model.entity.coffee.Coffee;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class CoffeeProduct {

    private double price;
    private double productMass;
    private Packaging packaging;
    private Coffee coffee;

    public CoffeeProduct() {
    }

    public CoffeeProduct(double price, double productMass, Packaging packaging, Coffee coffee) {
        this.price = price;
        this.productMass = productMass;
        this.packaging = packaging;
        this.coffee = coffee;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getProductMass() {
        return productMass;
    }

    public void setProductMass(double productMass) {
        this.productMass = productMass;
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
                "price=" + price +
                ", productMass=" + productMass +
                ", packaging=" + packaging +
                ", coffee=" + coffee +
                '}';
    }
}
