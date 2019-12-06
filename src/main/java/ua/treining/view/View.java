package ua.treining.view;

import ua.treining.model.entity.CoffeeProduct;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Class View has a static parameter MESSAGES_BUNDLE_NAME and
 * static final parameter ResourceBundle type bundle
 * This class output messages in two languages to console
 * @see ua.treining.controller.Controller
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

    /**
     * Method outputs message
     *
     * @param message String message
     * @see ua.treining.controller.Controller
     */
    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }

    /** Method output list parameters
     *  @see ua.treining.controller.Controller
     *  @see ua.treining.model.entity.Van */
    public void printProductList(List<CoffeeProduct> products) {
        for (CoffeeProduct coffee : products) {
            System.out.println(coffee.toString());
        }
    }

    /** Method output product
     *  @param product CoffeeProduct */
    public void printProduct(CoffeeProduct product) {
        System.out.println(product.toString());
    }
}
