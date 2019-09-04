package core.basesyntax;

import core.basesyntax.zooInhabitantsInstanses.Penguin;
import core.basesyntax.zooInhabitantsInstanses.Shark;
import core.basesyntax.zooInhabitantsInstanses.Sparrow;
import core.basesyntax.zooInhabitantsInstanses.Tiger;

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
