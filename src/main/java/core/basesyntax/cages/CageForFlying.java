package core.basesyntax.cages;

public class CageForFlying<Flyable> {
    private Flyable flyingAnimal;

    public void addAnimal(Flyable animal) {
        this.flyingAnimal = animal;
    }

    public Flyable getAnimal(){
        return flyingAnimal;
    }
}
