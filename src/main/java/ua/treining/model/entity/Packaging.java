package ua.treining.model.entity;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public enum Packaging {
    GLASS_SMALL(0.05, 0.15), GLASS_MEDIUM(0.1, 0.25), GLASS_LARGE(0.2, 0.35),

    PACK_MINI(0.002, 0.002), PACK_SMALL(0.05, 0.01), PACK_MEDIUM(0.1, 0.015), PACK_LARGE(0.2, 0.02);


    private final double size;       //g
    private final double mass;       //g

    Packaging(double size, double mass) {
        this.size = size;
        this.mass = mass;
    }

    public double getSize() {
        return size;
    }

    public double getMass() {
        return mass;
    }

}
