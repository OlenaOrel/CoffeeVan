package ua.training.version_2.model.entities.coffee;


import lombok.*;

/**
 * Created by Olena Orel on 14.12.2019.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class GrainCoffee implements Coffee {

    private SortOfCoffee sortOfCoffee;
    private Roast roast;

    public enum Roast {CINNAMON, LIGHT, AMERICAN, CITY, FULL_CITY}

    @Override
    public SortOfCoffee sort() {
        return getSortOfCoffee();
    }

}
