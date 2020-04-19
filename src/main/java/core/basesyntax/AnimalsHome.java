package core.basesyntax;

import java.util.LinkedList;

public class AnimalsHome<T extends Animal> {
    String name;
    LinkedList<T> animalsList;

    public AnimalsHome(String name) {
        this.name = name;
        this.animalsList = new LinkedList<T>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : animalsList) {
            sb.append("\n\t").append(t.name).append(", age: ").append(t.age);
        }
        return sb.toString();
    }
}
