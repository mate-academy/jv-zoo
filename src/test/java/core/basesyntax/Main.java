package core.basesyntax;

import core.basesyntax.animals.birds.Bird;
import core.basesyntax.animals.birds.Penguin;
import core.basesyntax.animals.birds.Sparrow;
import core.basesyntax.animals.fishes.Shark;
import core.basesyntax.animals.other.animals.Tiger;
import core.basesyntax.zoo.parts.Aviary;
import core.basesyntax.zoo.parts.Birdcage;
import core.basesyntax.zoo.parts.SwimmingPool;

public class Main {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        aviary.putAnimal(new Tiger());

        SwimmingPool swimmingPool = new SwimmingPool();
        swimmingPool.putAnimal(new Shark());

        Birdcage birdcage = new Birdcage();
        birdcage.putAnimal(new Penguin());
        birdcage.putAnimal(new Sparrow());

        ZooPark zoo = new ZooPark(aviary, swimmingPool, birdcage);
        zoo.feedAll();

        Penguin penguin = new Penguin();
        System.out.print("\nPenguin can swim ? ");
        penguin.swim();
        System.out.print("Penguin is a bird ? ");
        System.out.println(penguin instanceof Bird);
    }
}
