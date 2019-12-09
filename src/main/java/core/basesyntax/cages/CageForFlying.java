package core.basesyntax.cages;

public class CageForFlying<T> {
    private T flyingAnimal;

    public void addAnimal(T animal) {
        this.flyingAnimal = animal;
    }

    public T getAnimal() {
        return flyingAnimal;
    }
}
