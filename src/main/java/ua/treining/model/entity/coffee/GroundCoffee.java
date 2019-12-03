package ua.treining.model.entity.coffee;

/**
 * Created by Olena Orel on 03.12.2019.
 */
public class GroundCoffee extends Coffee {

    private GrainCoffee grainCoffee;

    public GroundCoffee() {
    }

    public GroundCoffee(GrainCoffee grainCoffee) {
        this.grainCoffee = grainCoffee;
    }

    public GroundCoffee(double mass, SortOfCoffee sort, GrainCoffee grainCoffee) {
        super(mass, sort);
        this.grainCoffee = grainCoffee;
    }

    public GrainCoffee getGrainCoffee() {
        return grainCoffee;
    }

    public void setGrainCoffee(GrainCoffee grainCoffee) {
        this.grainCoffee = grainCoffee;
    }

    @Override
    public String toString() {
        return "GroundCoffee{" +
                "grainCoffee=" + grainCoffee +
                "} " + super.toString();
    }
}
