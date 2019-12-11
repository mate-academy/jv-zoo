package core.basesyntax.app;

import core.basesyntax.animal.Penguin;
import core.basesyntax.animal.Shark;
import core.basesyntax.animal.Sparrow;
import core.basesyntax.animal.Tiger;
import core.basesyntax.cages.CageForAllAnimals;
import core.basesyntax.cages.CageForFlyingAnimal;
import core.basesyntax.cages.CageForSwimmingAnimal;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow("Black Sparrow");
        CageForFlyingAnimal<Sparrow> sparrowCage = new CageForFlyingAnimal<>(sparrow);
        System.out.println(sparrowCage.getAnimal().name);
        sparrowCage.getAnimal().fly();
        sparrowCage.getAnimal().feed();
        Penguin penguin = new Penguin("King Penguin");
        CageForSwimmingAnimal<Penguin> penguinCage = new CageForSwimmingAnimal<>(penguin);
        System.out.println(penguinCage.getAnimal().name);
        penguinCage.getAnimal().feed();
        penguinCage.getAnimal().swim();
        Tiger tiger = new Tiger("White Tiger");
        CageForAllAnimals<Tiger> tigerCage = new CageForAllAnimals<>(tiger);
        System.out.println(tigerCage.getAnimal().name);
        tigerCage.getAnimal().feed();
        Shark shark = new Shark("Big White Shark");
        CageForSwimmingAnimal<Shark> sharkCage = new CageForSwimmingAnimal<>(shark);
        System.out.println(sharkCage.getAnimal().name);
        sharkCage.getAnimal().feed();
        sharkCage.getAnimal().swim();
    }
}
