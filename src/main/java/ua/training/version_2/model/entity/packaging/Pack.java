package ua.training.version_2.model.entity.packaging;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Olena Orel on 14.12.2019.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Pack implements Packaging {

    int mass;
    int size;

    public Pack(int mass, int size) {
        checkParameters(mass, size);
        this.mass = mass;
        this.size = size;
    }

    @Override
    public int mass() {
        return getMass();
    }

    @Override
    public int size() {
        return getSize();
    }

    private void checkParameters(int mass, int size) {
        if (size <= 0 || mass <= 0) {
            throw new IllegalArgumentException();
        }
    }
}
