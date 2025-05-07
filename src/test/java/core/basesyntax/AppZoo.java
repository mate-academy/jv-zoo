package core.basesyntax;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Feel free to remove this class and create your own.
 */
public class AppZoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Penguin("Penguin"));
        animals.add(new Sparrow("Sparrow"));
        animals.add(new Tiger("Tiger"));
        animals.add(new Shark("Shark"));

        Zoo<Animal> zoo = new Zoo<>(animals);
        zoo.feed(zoo.aquarium());
        System.out.println();
        zoo.feed(zoo.enclosure());
        System.out.println();
        zoo.feed(zoo.aviary());

        System.out.println("------------------");
        zoo.whoIn(zoo.aquarium());
        System.out.println();
        zoo.whoIn(zoo.enclosure());
        System.out.println();
        zoo.whoIn(zoo.aviary());
    }

}