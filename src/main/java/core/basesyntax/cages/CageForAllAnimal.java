package core.basesyntax.cages;

public class CageForAllAnimal<T> {
    private T anyAnimal;

    public void addAnimal(T animal) {
        this.anyAnimal = animal;
    }

    public T getAnimal() {
        return anyAnimal;
    }
}
