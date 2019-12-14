package ua.treining.version_1.model.entity.coffee;

/**
 * Class Coffee with enum types parameter grindingDegree
 * @see GrindingDegree
 * GroundCoffee has a superclass
 * @see Coffee
 *
 * Created by Olena Orel on 03.12.2019.
 */
public class GroundCoffee extends Coffee {

    /**
     * Parameter grindingDegree
     */
    private GrindingDegree grindingDegree;

    /**
     * Constructor without parameter
     */
    public GroundCoffee() {
    }

    /** Constructor with sortOfCoffee parameter from superclass and grindingDegree parameter */
    public GroundCoffee(SortOfCoffee sort, GrindingDegree grindingDegree) {
        super(sort);
        this.grindingDegree = grindingDegree;
    }

    /** getter, setter, toString */
    public GrindingDegree getGrindingDegree() {
        return grindingDegree;
    }

    public void setGrindingDegree(GrindingDegree grindingDegree) {
        this.grindingDegree = grindingDegree;
    }

    @Override
    public String toString() {
        return "GroundCoffee{" +
                "grindingDegree=" + grindingDegree +
                "} " + super.toString();
    }
}
