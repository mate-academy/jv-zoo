package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Bird> cellBirds = new ArrayList<>();
    private List<Fish> cellFishes = new ArrayList<>();
    private List<LandAnimals> cellLandAnimals = new ArrayList<>();

    public List<Bird> getCellBirds() {
        return cellBirds;
    }

    public List<Fish> getCellFishes() {
        return cellFishes;
    }

    public List<LandAnimals> getCellLandAnimals() {
        return cellLandAnimals;
    }

    public void addBird(Bird bird) {
        cellBirds.add(bird);
    }

    public void addFish(Fish fish) {
        cellFishes.add(fish);
    }

    public void addLandAnimals(LandAnimals landAnimals) {
        cellLandAnimals.add(landAnimals);
    }

    public void feedAllAnimals() {
        getCellBirds().forEach(Animal::feed);
        getCellFishes().forEach(Animal::feed);
        getCellLandAnimals().forEach(Animal::feed);
    }

    public void behaviorOfAllAnimals() {
        getCellBirds().forEach(Animal::behavior);
        getCellFishes().forEach(Animal::behavior);
        getCellLandAnimals().forEach(Animal::behavior);
    }

}
