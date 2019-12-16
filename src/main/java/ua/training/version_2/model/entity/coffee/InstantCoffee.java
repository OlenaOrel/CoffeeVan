package ua.training.version_2.model.entity.coffee;

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
public class InstantCoffee extends Coffee {

    private SortOfCoffee sortOfCoffee;
    private TypeOfInstantCoffee type;

    public enum TypeOfInstantCoffee {POWDERED, AGGLOMERATED, SUBLIMATED}

    @Override
    public SortOfCoffee sort() {
        return getSortOfCoffee();
    }
}
