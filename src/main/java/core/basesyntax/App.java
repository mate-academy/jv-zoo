package core.basesyntax;

import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.cages.Aquarium;
import core.basesyntax.cages.CageAnimal;
import core.basesyntax.cages.CageBird;
import core.basesyntax.cages.Zoo;

public class App {
    public static void main(String[] args) {
        Zoo aquarium = new Aquarium();
        Zoo cageBird = new CageBird();
        Zoo cageAnimal = new CageAnimal();

        aquarium.put(new Shark());
        cageAnimal.put(new Penguin());
        cageBird.put(new Sparrow());
        cageAnimal.put(new Tiger());

        aquarium.feed();
        cageBird.feed();
        cageAnimal.feed();
    }
}
