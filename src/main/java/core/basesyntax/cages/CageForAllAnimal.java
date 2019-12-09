package core.basesyntax.cages;

public class CageForAllAnimal<Animal> {
    private Animal anyAnimal;

    public void addAnimal(Animal animal) {
        this.anyAnimal = animal;
    }

    public Animal getAnimal(){
        return anyAnimal;
    }
}
