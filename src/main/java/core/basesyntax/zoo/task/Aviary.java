package core.basesyntax.zoo.task;

import core.basesyntax.zoo.task.animals.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aviary<T> {
    private List<T> animalsInThisAviary;

    public Aviary() {
        animalsInThisAviary = new ArrayList<>();
    }

    public void addAll(List<? extends T> list) {
        animalsInThisAviary.addAll(list);
    }

    public List<Animal> getAnimals() {
        return animalsInThisAviary.stream()
                .map(Animal.class::cast)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : animalsInThisAviary) {
            sb.append(t.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}
