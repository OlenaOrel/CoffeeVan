package ua.training.version_2.view;

import ua.training.version_2.model.entities.CoffeeProduct;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
//                    new Locale("ua", "UA"));  // Ukrainian
                    new Locale("en"));        // English

    /**
     * Method outputs message
     *
     * @param message String message
     */
    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }

    /**
     * Method output list parameters
     *
     * @param products list
     */
    public void printProductList(List<CoffeeProduct> products) {
        products.forEach(this::printProduct);
    }

    /**
     * Method output product
     *
     * @param product CoffeeProduct
     */
    public void printProduct(CoffeeProduct product) {
        System.out.println(product.toString());
    }


}
