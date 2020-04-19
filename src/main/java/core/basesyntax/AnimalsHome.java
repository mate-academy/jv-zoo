package core.basesyntax;

import java.util.LinkedList;

public class AnimalsHome<T extends Animal> {
    private static final String ANIMALS_HOME_NAME = "Общий вольер";
    String name;
    LinkedList<T> animalsList;

    public AnimalsHome() {
        this.animalsList = new LinkedList<T>();
    }

    public AnimalsHome(String name) {
        this.name = name;
        this.animalsList = new LinkedList<T>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : animalsList) {
            sb.append("\n\t").append(t.name).append(", ").append(t.age);
        }
        return sb.toString();
    }
}
