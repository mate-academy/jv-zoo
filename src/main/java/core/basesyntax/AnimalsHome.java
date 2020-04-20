package core.basesyntax;

import java.util.HashMap;
import java.util.Map;

public class AnimalsHome<T extends Animal> {
    String name;
    HashMap<String, Animal> animalHashMap;

    public AnimalsHome(String name) {
        this.name = name;
        this.animalHashMap = new HashMap<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Animal> m : animalHashMap.entrySet()) {
            sb.append("\n\t").append(m.getValue().name).append(", age: ").append(m.getValue().age);
        }
        return sb.toString();
    }
}
