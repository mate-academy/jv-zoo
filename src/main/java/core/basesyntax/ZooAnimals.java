package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public abstract class ZooAnimals implements Feedable {
    public String name;
    public Aviary aviary;

    public List<ZooAnimals> birdHabitat = new ArrayList<>();
    public List<ZooAnimals> landHabitat = new ArrayList<>();
    public List<ZooAnimals> waterHabitat = new ArrayList<>();

    public ZooAnimals(String name) {
        this.name = name;
    }

    public void addToZoo(ZooAnimals animal, List<ZooAnimals> zoo) {
        zoo.add(animal);
        switch (animal.aviary) {
            case LAND:
                landHabitat.add(animal);
                break;
            case AIR:
                birdHabitat.add(animal);
                break;
            case WATER:
                waterHabitat.add(animal);
                break;
            default:
                break;
        }
    }
}
