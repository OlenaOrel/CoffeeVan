package ua.training.version_2.model.entities;

import lombok.Data;
import ua.training.version_1.model.entity.CoffeeProduct;

import java.util.List;

/**
 * Created by Olena Orel on 14.12.2019.
 */
@Data
public class Van {

    private int vanSize;
    private int amountOfMoney;
    private List<CoffeeProduct> products;

}
