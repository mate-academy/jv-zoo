package core.basesyntax;

import core.basesyntax.animals.Bird;
import core.basesyntax.animals.Fish;
import core.basesyntax.animals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T> {
    private List<Bird> cell = new ArrayList<>();
    private List<Mammal> aviary = new ArrayList<>();
    private List<Fish> aquarium = new ArrayList<>();

    private List<Animal> animals = new ArrayList<>();

    public Zoo() {
        animals.addAll(cell);
        animals.addAll(aviary);
        animals.addAll(aquarium);
    }

    public void feed() {
        for (Animal animal : this.animals) {
            animal.setFool(true);
        }
    }

    public List<Bird> getCell() {
        return cell;
    }

    public void setCell(List<Bird> cell) {
        this.cell = cell;
    }

    public List<Mammal> getAviary() {
        return aviary;
    }

    public void setAviary(List<Mammal> aviary) {
        this.aviary = aviary;
    }

    public List<Fish> getAquarium() {
        return aquarium;
    }

    public void setAquarium(List<Fish> aquarium) {
        this.aquarium = aquarium;
    }

    public void addBird(Bird bird) {
        cell.add(bird);
        animals.add(bird);
    }

    public void addFish(Fish fish) {
        aquarium.add(fish);
        animals.add(fish);
    }

    public void addMammal(Mammal mammal) {
        aviary.add(mammal);
        animals.add(mammal);
    }
}
