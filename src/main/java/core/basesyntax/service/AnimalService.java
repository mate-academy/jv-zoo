package core.basesyntax.service;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Fish;
import core.basesyntax.animals.FloatingBird;
import core.basesyntax.animals.FlyingBird;
import core.basesyntax.animals.Mammals;
import core.basesyntax.enums.FishGenus;
import core.basesyntax.enums.FloatingBirdGenus;
import core.basesyntax.enums.FlyingBirdGenus;
import core.basesyntax.enums.MammalGenus;
import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    public List<Animal> getListRandomAnimal(int size) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            animals.add(getRandomAnimal());
        }
        return animals;
    }

    public Animal getRandomAnimal() {
        int randomValue = (int) (Math.random() * 4);
        switch (randomValue) {
            case 0:
                return new Fish(getRandomFishGenus());
            case 1:
                return new FloatingBird(FloatingBirdGenus.PENGUIN);
            case 2:
                return new FlyingBird(getRandomFlyingBirdGenus());
            default:
                return new Mammals(getRandomMammalGenus());
        }
    }

    private FlyingBirdGenus getRandomFlyingBirdGenus() {
        int randomValue = (int) (Math.random() * 4);
        return FlyingBirdGenus.values()[randomValue];
    }

    private FishGenus getRandomFishGenus() {
        int randomValue = (int) (Math.random() * 4);
        return FishGenus.values()[randomValue];
    }

    private MammalGenus getRandomMammalGenus() {
        int randomValue = (int) (Math.random() * 4);
        return MammalGenus.values()[randomValue];
    }

}
