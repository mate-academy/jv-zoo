package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public abstract class ZooAnimals<T> implements Feedable {
    public String name;
    public Aviary aviary;

    private List<T> birdHabitat = new ArrayList<>();
    private List<T> landHabitat = new ArrayList<>();
    private List<T> waterHabitat = new ArrayList<>();

    public ZooAnimals(String name) {
        this.name = name;
    }

    public void addToZoo(ZooAnimals<T> animal, List<T> zoo) {
        zoo.add((T) animal);
        switch (animal.aviary) {
            case LAND:
                landHabitat.add((T) animal);
                break;
            case AIR:
                birdHabitat.add((T) animal);
                break;
            case WATER:
                waterHabitat.add((T) animal);
                break;
            default:
                break;
        }
    }
}
