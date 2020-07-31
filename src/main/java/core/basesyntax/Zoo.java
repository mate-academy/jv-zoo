package core.basesyntax;

import core.basesyntax.models.aviars.AnimalsAviary;
import core.basesyntax.models.aviars.Aquarium;
import core.basesyntax.models.aviars.BirdsAviary;

public class Zoo {
    private AnimalsAviary animalsAviary;
    private Aquarium aquarium;
    private BirdsAviary birdsAviary;

    public Zoo(AnimalsAviary animalsAviary, Aquarium aquarium, BirdsAviary birdsAviary) {
        this.animalsAviary = animalsAviary;
        this.aquarium = aquarium;
        this.birdsAviary = birdsAviary;
    }

    public void feedAllAnimals() {
        animalsAviary.feedAnimals();
        aquarium.feedAllFishes();
        birdsAviary.feedAllBirds();
    }

    public AnimalsAviary getAnimalsAviary() {
        return animalsAviary;
    }

    public void setAnimalsAviary(AnimalsAviary animalsAviary) {
        this.animalsAviary = animalsAviary;
    }

    public Aquarium getAquarium() {
        return aquarium;
    }

    public void setAquarium(Aquarium aquarium) {
        this.aquarium = aquarium;
    }

    public BirdsAviary getBirdsAviary() {
        return birdsAviary;
    }

    public void setBirdsAviary(BirdsAviary birdsAviary) {
        this.birdsAviary = birdsAviary;
    }
}
