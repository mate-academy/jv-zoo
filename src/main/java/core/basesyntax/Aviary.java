package core.basesyntax;
import java.util.ArrayList;
import java.util.List;

public class Aviary<T> {

    private List<T> specificAviary;
    private String aviaryType;

    public Aviary(String aviaryType) {
        specificAviary = new ArrayList<>();
        this.aviaryType = aviaryType;
    }

    public void addAnimal(T animalSubSpecies) {
        specificAviary.add(animalSubSpecies);
    }

    public int aviaryFullness() {
        return specificAviary.size();
    }

    public void feedAnimals() {
        System.out.println(String.format("The food was delivered to the aviary for %s animals. Time to eat", aviaryType));
        for (T animal : this.specificAviary) {
            System.out.println(((Animal) animal).eat());
        }
        System.out.println("All animals in this aviary have been fed \n");
    }
}

