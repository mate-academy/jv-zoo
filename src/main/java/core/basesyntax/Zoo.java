package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

/**
 * Feel free to remove this class and create your own.
 * В зоопарке должны быть вольер для птиц, для всех животных и аквариум
 * Создать классы тигр, пингвин, воробей и акула и добавить в соответствующие среды обитания (см. п.2)
 * Птицы должны уметь летать, рыбы должны уметь плавать. Обратите внимание на пингвина,
 * там не все так просто: он может плавать, но не может летать, при єтом является птицей
 * Должна быть возможность накормить всех животных
 * Для решения задачи воспользоваться Дженериками
 */
public class Zoo {
    public static void main(String[] args) {

        List<Bird> aviaryАorИirds = new ArrayList<>();
        List<WaterAnimals> aquarium = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        Animal sparrow = new Sparrow();
        Animal shark = new Shark();
        Animal penguin = new Penguin();
        Animal tiger = new Tiger();

        animals.add(tiger);
        animals.add(sparrow);
        animals.add(penguin);
        animals.add(shark);

        aviaryАorИirds.add((Bird) sparrow);
        aquarium.add((WaterAnimals) shark);
        aquarium.add((WaterAnimals) penguin);

        toFeedAnimal(animals);
        animalIsMove(animals);
    }

    public static void toFeedAnimal(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public static void animalIsMove(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
    }
}
