package ua.treining.model.entity.coffee;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class GroundCoffee extends Coffee {

    private GrindingDegree grindingDegree;

    public GroundCoffee() {
    }

    public GroundCoffee(double mass, SortOfCoffee sort, GrindingDegree grindingDegree) {
        super(mass, sort);
        this.grindingDegree = grindingDegree;
    }

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
