package core.basesyntax;

import core.basesyntax.models.animals.Animal;
import core.basesyntax.models.animals.Penguin;
import core.basesyntax.models.animals.Shark;
import core.basesyntax.models.animals.Sparrow;
import core.basesyntax.models.animals.Tiger;
import core.basesyntax.models.aviars.AnimalsAviary;
import core.basesyntax.models.aviars.Aquarium;
import core.basesyntax.models.aviars.BirdsAviary;
import core.basesyntax.models.interfaces.Flyable;
import core.basesyntax.models.interfaces.Swimable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BirdsAviary birdsAviary = new BirdsAviary(getBirds());
        Aquarium aquarium = new Aquarium(getFishes());
        AnimalsAviary animalsAviary = new AnimalsAviary(getAnimals());
        Zoo zoo = new Zoo(animalsAviary, aquarium, birdsAviary);

        zoo.feedAllAnimals();
        System.out.println("-----------------");
        howAnimalsMove(zoo);
    }

    private static void howAnimalsMove(Zoo zoo) {
        zoo.getAquarium().getFishes().forEach(f -> ((Swimable) f).swim());
        zoo.getBirdsAviary().getBirds().stream().filter(b -> (b instanceof Penguin))
                .forEach(f -> ((Swimable) f).swim());
        zoo.getBirdsAviary().getBirds().stream().filter(b -> !(b instanceof Penguin))
                .forEach(f -> ((Flyable) f).fly());
        zoo.getAnimalsAviary().getAnimals().forEach(a -> a.doSomething());
    }

    private static List<Animal> getAnimals() {
        List<Animal> list = new ArrayList<>();
        Tiger tigerLex = new Tiger("Lex", 2);
        Tiger tigerRobby = new Tiger("Robby", 3);
        list.add(tigerLex);
        list.add(tigerRobby);
        return list;
    }

    private static List<Animal> getFishes() {
        List<Animal> list = new ArrayList<>();
        Shark sharkLinda = new Shark("Linda", 5);
        Shark sharkJoe = new Shark("Joe", 7);
        list.add(sharkLinda);
        list.add(sharkJoe);
        return list;
    }

    private static List<Animal> getBirds() {
        List<Animal> list = new ArrayList<>();
        Sparrow sparrowJack = new Sparrow("Jack", 1);
        Sparrow sparrowJane = new Sparrow("Jane", 1);
        Penguin penguinChristopher = new Penguin("Christopher", 8);
        Penguin penguinMargarita = new Penguin("Margarita", 4);
        list.add(sparrowJack);
        list.add(sparrowJane);
        list.add(penguinChristopher);
        list.add(penguinMargarita);
        return list;
    }

}
