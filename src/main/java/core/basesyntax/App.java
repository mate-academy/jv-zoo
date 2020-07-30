package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.service.AnimalService;
import core.basesyntax.zoo.Aviary;
import java.util.List;

public class App {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();
        List<Animal> animals = animalService.getListRandomAnimal(30);

        System.out.println("Животные которые поступили в зоопарк!");
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        Aviary aquarium = new Aviary();
        Aviary birds = new Aviary();
        Aviary common = new Aviary();

        for (Animal animal : animals) {
            while (!animal.isSatiety()) {
                animal.eat(10);
            }
            switch (animal.getAnimalClass()) {
                case FISH:
                case FLOATING_BIRD:
                    aquarium.addAnimal(animal);
                    break;
                case FLYING_BIRD:
                    birds.addAnimal(animal);
                    break;
                default:
                    common.addAnimal(animal);
            }
        }

        System.out.println("Животные распределены по вольерам и накормленные!");
        System.out.println(" --- аквариум ---");
        aquarium.outputListAnimalsInAviary();
        System.out.println(" --- вольер для птиц ---");
        birds.outputListAnimalsInAviary();
        System.out.println(" --- общий ---");
        common.outputListAnimalsInAviary();
    }

}
