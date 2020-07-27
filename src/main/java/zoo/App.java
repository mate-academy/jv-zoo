package zoo;

import java.util.ArrayList;
import java.util.List;
import zoo.animal.Animal;
import zoo.animal.Bird;
import zoo.animal.Fish;
import zoo.environment.AnimalAviary;
import zoo.environment.Aquarium;
import zoo.environment.BirdAviary;
import zoo.model.Pinguin;
import zoo.model.Shark;
import zoo.model.Sparrow;
import zoo.model.Tiger;

public class App {
    private static final AnimalAviary animalAviary = new AnimalAviary();
    private static final Aquarium aquarium = new Aquarium();
    private static final BirdAviary birdAviary = new BirdAviary();

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Fish> fishes = new ArrayList<>();
        List<Bird> birds = new ArrayList<>();

        Pinguin pinguin = new Pinguin("pinguin", 2L);
        Sparrow sparrow = new Sparrow("sparrow", 1L, "~~~~birds singing~~~~~", 1.8);
        birdAviary.addBird(birds, List.of(pinguin, sparrow));

        Shark shark = new Shark("shark", 5L);
        aquarium.addFish(fishes, List.of(shark));

        Tiger tiger = new Tiger("tiger", 7L, 2.5, 120, 53);
        animalAviary.addAnimal(animals, List.of(tiger));

        animalAviary.getAnimal(animals);

        aquarium.getFish(fishes);

        birdAviary.getBird(birds);

        System.out.println(animalAviary.feed());
        System.out.println(aquarium.feed());
        System.out.println(birdAviary.feed());
    }
}
