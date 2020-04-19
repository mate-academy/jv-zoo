package core.basesyntax;

import java.util.LinkedList;

public class Aquarium<T extends Fish> extends AnimalsHome {
    private static final String AQUARIUM_NAME = "Аквариум";
//    private LinkedList<T> aquariumList;
//
//    public Aquarium() {
//        this.aquariumList = new LinkedList<T>();
//    }


    public Aquarium() {
        this.name = AQUARIUM_NAME;
        this.animalsList = new LinkedList<T>();
    }
}
