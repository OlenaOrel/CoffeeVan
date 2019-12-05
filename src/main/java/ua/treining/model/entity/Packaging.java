package ua.treining.model.entity;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public enum Packaging {
    GLASS_SMALL(0.15, 0.05), GLASS_MEDIUM(0.25, 0.1), GLASS_LARGE(0.35, 0.2),

    PACK_SMALL(0.01, 0.05), PACK_MEDIUM(0.015, 0.1), PACK_LARGE(0.02, 0.2);

    private final double mass;       //g
    private final double size;

    Packaging(double mass, double size) {
        this.mass = mass;
        this.size = size;
    }

    public double massWithCoffee() {
        return mass + size;
    }

    public double getMass() {
        return mass;
    }

    public double getSize() {
        return size;
    }
}
