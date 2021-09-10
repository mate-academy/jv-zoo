package core.basesyntax;

import java.util.Objects;

public abstract class Animal {
    private final String species;
    private double weight;
    private String name;
    private String favouriteFood;

    protected Animal(String species, double weight, String name, String favouriteFood) {
        this.species = species;
        this.weight = weight;
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public void feed() {
        System.out.printf("%s: Om-nom-nom... Do you have more %s?\n", name, favouriteFood);
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return weight == animal.weight
                && Objects.equals(species, animal.species)
                && Objects.equals(name, animal.name)
                && Objects.equals(favouriteFood, animal.favouriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, species, name, favouriteFood);
    }

    @Override
    public String toString() {
        return new StringBuilder("I am ").append(species)
                .append(", my name is ").append(name)
                .append(", and my favourite food is ").append(favouriteFood)
                .append("!").toString();
    }
}
