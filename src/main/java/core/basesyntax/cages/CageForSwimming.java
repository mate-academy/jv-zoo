package core.basesyntax.cages;

public class CageForSwimming<T> {
    private T swimableAnimal;

    public void addAnimal(T animal) {
        this.swimableAnimal = animal;
    }

    public T getAnimal() {
        return swimableAnimal;
    }
}
