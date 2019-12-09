package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> inhabitants = new ArrayList<>();
    private List<Animal> cage = new ArrayList<>();
    private List<Animal> aquarium = new ArrayList<>();
    private List<Animal> aviary = new ArrayList<>();

    public Zoo(List<Animal> inhabitants) {
        this.inhabitants = inhabitants;
        for (Animal animal : inhabitants) {
            if (animal.getHabitat().equals("air")) {
                cage.add(animal);
            }
            if (animal.getHabitat().equals("water")) {
                aquarium.add(animal);
            }
            if (animal.getHabitat().equals("land")) {
                aviary.add(animal);
            }
        }

    }

    public Zoo(Animal animal) {
        inhabitants.add(animal);
        putInCage(animal);
    }

    public List<Animal> getInhabitants() {
        return inhabitants;
    }

    public List<Animal> getCage() {
        return cage;
    }

    public List<Animal> getAquarium() {
        return aquarium;
    }

    public List<Animal> getAviary() {
        return aviary;
    }

    public void addNewAnimal(Animal animal) {
        inhabitants.add(animal);
        putInCage(animal);

    }

    public void feedAnimals() {
        for (Animal animal : inhabitants) {
            animal.feed();
        }
    }

    private void putInCage(Animal animal) {
        if (animal.getHabitat().equals("air")) {
            cage.add(animal);
        }
        if (animal.getHabitat().equals("water")) {
            aquarium.add(animal);
        }
        if (animal.getHabitat().equals("land")) {
            aviary.add(animal);
        }

    }


}
