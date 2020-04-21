package core.basesyntax;

import java.util.Objects;

public abstract class Bird extends Animal {
    private int numberOfEggsLaying;

    protected Bird(String species, double weight, String name, String favouriteFood,
                int numberOfEggsLaying) {
        super(species, weight, name, favouriteFood);
        this.numberOfEggsLaying = numberOfEggsLaying;
    }

    public int getNumberOfEggsLaying() {
        return numberOfEggsLaying;
    }

    public void setNumberOfEggsLaying(int numberOfEggsLaying) {
        this.numberOfEggsLaying = numberOfEggsLaying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass() || !super.equals(o)) {
            return false;
        }
        Bird bird = (Bird) o;
        return numberOfEggsLaying == bird.numberOfEggsLaying;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfEggsLaying);
    }
}
