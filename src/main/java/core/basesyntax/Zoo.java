package core.basesyntax;

import core.basesyntax.models.Animal;
import core.basesyntax.models.Bird;
import core.basesyntax.models.Fish;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private Area<Fish> fishArea;
    private Area<Bird> birdArea;
    private Area<Animal> otherArea;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
        fishArea = new Area<>();
        birdArea = new Area<>();
        otherArea = new Area<>();
    }

    public void leadToArea() {
        animals.forEach(this::chooseArea);
    }

    private void chooseArea(Animal animal) {
        int type = animal instanceof Bird
                ? 1 : animal instanceof Fish
                ? 2 : 3;
        switch (type) {
            case 1:
                birdArea.add((Bird) animal);
                break;
            case 2:
                fishArea.add((Fish) animal);
                break;
            default:
                otherArea.add(animal);
        }
    }

    public void feedAnimals() {
        System.out.println("Bird area: ");
        birdArea.feedAnimals();
        System.out.println("Fish area: ");
        fishArea.feedAnimals();
        System.out.println("Other area: ");
        otherArea.feedAnimals();
    }
}
