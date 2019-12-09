package core.basesyntax.cages;

public class CageForSwimming<Swimable> {
    private Swimable swimableAnimal;

    public void addAnimal(Swimable animal) {
        this.swimableAnimal = animal;
    }

    public Swimable getAnimal(){
        return swimableAnimal;
    }
}
