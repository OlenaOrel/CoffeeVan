package ua.training.version_1.model.entity;


import ua.training.version_1.model.entity.coffee.Coffee;

/**
 * Class CoffeeProduct with parameters price, productMass
 * packaging and coffee
 * Coffee is a superclass
 * @see Coffee
 * @see Packaging
 *
 * Created by Olena Orel on 03.12.2019.
 */
public class CoffeeProduct {

    private int price;
    private int productMass;
    private Packaging packaging;
    private Coffee coffee;

    public CoffeeProduct() {
    }

    public CoffeeProduct(int price, Packaging packaging, Coffee coffee) {
        this.price = price;
        productMass = packaging.massWithCoffee();
        this.packaging = packaging;
        this.coffee = coffee;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductMass() {
        return productMass;
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

    // calculate price of one kg coffee
    public int priceOfOneKgCoffee() {
        return (price * 1000) / packaging.getSize();
    }
}
