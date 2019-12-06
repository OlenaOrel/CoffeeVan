package ua.treining.view;

import ua.treining.model.entity.CoffeeProduct;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
//                    new Locale("ua", "UA"));  // Ukrainian
                    new Locale("en"));        // English

    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }

    public void printProductList(List<CoffeeProduct> products) {
        for (CoffeeProduct coffee : products) {
            System.out.println(coffee.toString());
        }
    }

    public void printProduct(CoffeeProduct product) {
        System.out.println(product.toString());
    }
}
