package zoo.environment;

import java.util.List;
import zoo.animal.Animal;
import zoo.features.Feedable;

public class AnimalAviary implements Feedable {

    public void addAnimal(List<? super Animal> animals, List<? extends Animal> animal) {
        animals.addAll(animal);
    }

    public void getAnimal(List<? extends Animal> animals) {
        animals.forEach(System.out::println);
    }

    @Override
    public String feed() {
        return "Animals are fed!!!";
    }
}
