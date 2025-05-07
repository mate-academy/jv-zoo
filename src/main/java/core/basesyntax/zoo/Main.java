package core.basesyntax.zoo;

import core.basesyntax.zoo.task.Zoo;
import core.basesyntax.zoo.task.animals.Animal;
import core.basesyntax.zoo.task.animals.Penguin;
import core.basesyntax.zoo.task.animals.Shark;
import core.basesyntax.zoo.task.animals.Sparrow;
import core.basesyntax.zoo.task.animals.Tiger;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Tiger(), new Penguin(), new Sparrow(), new Shark());
        Zoo zoo = new Zoo(animals);

        zoo.peek();
        zoo.feed(animals);
    }
}
