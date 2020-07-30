package core.basesyntax;

import core.basesyntax.animal.Animal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Класс описывает вольер для животных. Он может быть параметризован
 * определенным типом животных. Интерфейс класса содержит три метода:
 * - добавить животное в вольер
 * - удалить животное из вольера
 * - получить сет животных (для просмотра, без права изменения содержимого вольера)
 */
public class Aviary<T extends Animal> {
    private final Set<T> animals = new HashSet<>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void removeAnimal(T animal) {
        animals.remove(animal);
    }

    public Set<T> getAnimals() {
        return Collections.unmodifiableSet(animals);
    }
}
