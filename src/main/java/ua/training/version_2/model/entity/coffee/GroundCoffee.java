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
public class GroundCoffee extends Coffee {

    private SortOfCoffee sortOfCoffee;
    private GrindingDegree degree;

    public enum GrindingDegree {PULVERIZED, FINE_GRIND, MEDIUM_GRIND, COURSE_GRIND}

    @Override
    public SortOfCoffee sort() {
        return getSortOfCoffee();
    }
}
