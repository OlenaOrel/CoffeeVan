package ua.training.version_2.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by Olena Orel on 14.12.2019.
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Van {

    private int vanSize;
    private int amountOfMoney;
    private List<CoffeeProduct> products;

}
