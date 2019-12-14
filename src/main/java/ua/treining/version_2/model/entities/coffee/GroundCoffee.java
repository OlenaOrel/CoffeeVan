package ua.treining.version_2.model.entities.coffee;

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
public class GroundCoffee implements Coffee {

    private SortOfCoffee sortOfCoffee;
    private GrindingDegree degree;

    public enum GrindingDegree {PULVERIZED, FINE_GRIND, MEDIUM_GRIND, COURSE_GRIND}

    @Override
    public SortOfCoffee sort() {
        return getSortOfCoffee();
    }
}
