package core.basesyntax;

import java.util.Objects;

public abstract class Fish extends Animal {
    private int numberOfFins;

    protected Fish(String species, double weight, String name, String favouriteFood,
                int numberOfFins) {
        super(species, weight, name, favouriteFood);
        this.numberOfFins = numberOfFins;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass() || !super.equals(o)) {
            return false;
        }
        Fish fish = (Fish) o;
        return numberOfFins == fish.numberOfFins;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfFins);
    }
}
