package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<LandAnimals> cellForLandAnimals = new ArrayList<>();
    private final List<Bird> cellForBirds = new ArrayList<>();
    private final List<Fish> aquarium = new ArrayList<>();

    public List<LandAnimals> getCellForLandAnimals(){
        return cellForLandAnimals;
    }

    public List<Bird> getCellForBirds(){
        return cellForBirds;
    }

    public List<Fish> getAquarium(){
        return aquarium;
    }

    public void addLandAnimal(LandAnimals landAnimal){
        cellForLandAnimals.add(landAnimal);
    }

    public void addBird(Bird bird){
        cellForBirds.add(bird);
    }

    public void addFish(Fish fish){
        aquarium.add(fish);
    }

    public void feedAnimals(){
        getCellForLandAnimals().forEach(Animal::feed);
        getCellForBirds().forEach(Bird::feed);
        getAquarium().forEach(Fish::feed);
    }

    public void doAction(){
        getCellForLandAnimals().forEach(Animal::act);
        getCellForBirds().forEach(Bird::act);
        getAquarium().forEach(Fish::act);
    }
}
