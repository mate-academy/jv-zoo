package core.basesyntax;

import core.basesyntax.models.Animal;
import core.basesyntax.models.Penguin;
import core.basesyntax.models.Shark;
import core.basesyntax.models.Sparrow;
import core.basesyntax.models.Tiger;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = List.of(new Sparrow(), new Penguin(), new Shark(), new Tiger());
        Zoo zoo = new Zoo(animals);
        zoo.leadToArea();
        zoo.feedAnimals();
        System.out.println("\nAbilities: ");
        animals.forEach(Animal::showAbility);
    }
}
