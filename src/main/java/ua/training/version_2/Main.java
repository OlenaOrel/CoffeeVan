package ua.training.version_2;

import ua.training.version_2.controller.Controller;
import ua.training.version_2.model.CoffeeVanUtility;
import ua.training.version_2.view.View;

/**
 * Created by Olena Orel on 14.12.2019.
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new View(), new CoffeeVanUtility());
        controller.processVan();
    }
}
