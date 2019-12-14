package ua.treining.version_2.model.entities.packaging;

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
public class Pack implements Packaging {

    int mass;
    int size;

    @Override
    public int mass() {
        return getMass();
    }

    @Override
    public int size() {
        return getSize();
    }
}
