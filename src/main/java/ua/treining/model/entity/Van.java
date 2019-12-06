package ua.treining.model.entity;

import java.util.List;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class Van {

    private int vanSize;
    private int amountOfMoney;
    private List<CoffeeProduct> products;

    public Van() {
    }

    public Van(int vanSize, int amountOfMoney, List<CoffeeProduct> products) {
        this.vanSize = vanSize;
        this.amountOfMoney = amountOfMoney;
        this.products = products;
    }

    public int getVanSize() {
        return vanSize;
    }

    public void setVanSize(int vanSize) {
        this.vanSize = vanSize;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public List<CoffeeProduct> getProducts() {
        return products;
    }

    public void setProducts(List<CoffeeProduct> products) {
        this.products = products;
    }
}
