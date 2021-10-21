package core.basesyntax.model;

import core.basesyntax.Bird;
import core.basesyntax.Fish;
import core.basesyntax.Mammals;
import java.util.List;

public class Zoo {
    private List<? super Fish> aquarium;
    private List<? super Bird> cage;
    private List<? super Mammals> aviary;

    public Zoo(List<? super Fish> aquarium, List<? super Bird> cage, List<? super Mammals> aviary) {
        this.aquarium = aquarium;
        this.cage = cage;
        this.aviary = aviary;
    }

    public List<? super Fish> getAquarium() {
        return aquarium;
    }

    public Zoo setAquarium(List<? super Fish> aquarium) {
        this.aquarium = aquarium;
        return this;
    }

    public List<? super Bird> getCage() {
        return cage;
    }

    public Zoo setCage(List<? super Bird> cage) {
        this.cage = cage;
        return this;
    }

    public List<? super Mammals> getAviary() {
        return aviary;
    }

    public Zoo setAviary(List<? super Mammals> aviary) {
        this.aviary = aviary;
        return this;
    }

    public void printMessage() {
        System.out.println("aquarium: " + aquarium);
        System.out.println("cage: " + cage);
        System.out.println("aviary: " + aviary);
    }

}
