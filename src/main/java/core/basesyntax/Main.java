package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.buildings.Cage;
import core.basesyntax.buildings.Zoo;
import core.basesyntax.skills.Fly;
import core.basesyntax.skills.Swim;

public class Main {
    public static void main(String[] args) {
        Cage<Animal> cage = new Cage<>();
        Zoo myZoo = new Zoo(cage);
        Animal shark = new Shark("Bit");
        cage.add(shark);
        Animal penguin = new Penguin("Lucky");
        cage.add(penguin);
        Animal sparrow = new Sparrow("Quick");
        cage.add(sparrow);
        Animal tiger = new Tiger("Sad");
        cage.add(tiger);

        cage.giveEat(shark);
        cage.giveEat(penguin);
        cage.giveEat(sparrow);
        cage.giveEat(tiger);

        System.out.println();

        Swim swimedShark = (Swim) shark;
        swimedShark.swimming();
        Swim swimedPenguin = (Swim) penguin;
        swimedPenguin.swimming();

        System.out.println();

        Fly fliedSparrow = (Fly) sparrow;
        fliedSparrow.flying();
    }
}
