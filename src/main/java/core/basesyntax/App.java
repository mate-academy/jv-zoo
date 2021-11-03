package core.basesyntax;

import core.basesyntax.instanses.Penguin;
import core.basesyntax.instanses.Shark;
import core.basesyntax.instanses.Sparrow;
import core.basesyntax.instanses.Tiger;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Tiger tiger = new Tiger();
        Sparrow sparrow = new Sparrow();
        Shark shark = new Shark();
        Penguin penguin = new Penguin();
        zoo.getBirdcage().add(sparrow);
        zoo.getBirdcage().add(penguin);
        zoo.getAquarium().add(shark);
        zoo.getAviary().add(tiger);
        zoo.feedZooInhabitants(zoo.getAquarium());
        zoo.feedZooInhabitants(zoo.getAviary());
        zoo.feedZooInhabitants(zoo.getBirdcage());
    }
}
