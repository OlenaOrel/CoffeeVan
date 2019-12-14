package ua.training.version_1;

import ua.training.version_1.controller.Controller;
import ua.training.version_1.model.CoffeeVanUtility;
import ua.training.version_1.view.View;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new View(), new CoffeeVanUtility());
        controller.processVan();

    }

}
