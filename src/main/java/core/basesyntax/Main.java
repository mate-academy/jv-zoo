package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Tiger;
import core.basesyntax.exception.HungryAnimalException;
import core.basesyntax.exception.WrongAnimalException;
import core.basesyntax.premises.Aquarium;

public class Main {
    public static void main(String[] args) throws HungryAnimalException {
        Zoo myZoo = new Zoo();
        myZoo.aquarium = new Aquarium();
        Animal shark = new Shark();
        Animal shark2 = new Shark();
        Animal tiger = new Tiger();

        try {
            myZoo.aquarium.goToPremises(shark);
            myZoo.aquarium.goToPremises(shark2);
            myZoo.aquarium.goToPremises(tiger);
        } catch (WrongAnimalException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myZoo.aquarium.getInmatesCount());
        tiger.move();
        tiger.move();
        tiger.move();
        tiger.eat();
    }
}
