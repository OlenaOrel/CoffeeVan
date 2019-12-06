package ua.treining.model.entity;

/**
 * Enum Packaging has parameters mass and size of package
 * Created by Olena Orel on 03.12.2019.
 */
public enum Packaging {
    GLASS_SMALL(150, 50), GLASS_MEDIUM(250, 100), GLASS_LARGE(350, 200),

    PACK_SMALL(10, 50), PACK_MEDIUM(15, 100), PACK_LARGE(20, 200);

    /**
     * Parameter mass
     */
    private final int mass;      //g

    /**
     * Parameter size
     */
    private final int size;      //g

    /** Constructor with parameters: mass, size */
    Packaging(int mass, int size) {
        this.mass = mass;
        this.size = size;
    }

    /** Method calculated mass Coffee with Packaging
     * @see CoffeeProduct
     * @return mass+size
     */
    public int massWithCoffee() {
        return mass + size;
    }

    //getters
    public int getMass() {
        return mass;
    }

    public int getSize() {
        return size;
    }
}
