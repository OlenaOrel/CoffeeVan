package ua.treining;

import ua.treining.controller.Controller;
import ua.treining.model.CoffeeVanUtility;
import ua.treining.view.View;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new View(), new CoffeeVanUtility());
        controller.processVan();

    }

}
