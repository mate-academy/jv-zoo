package core.basesyntax;

public class Zoo<T1 extends Fish, T2 extends Bird, T3 extends Cat> {
    private static final String AQUARIUM_NAME = "Аквариум";
    private static final String BIRDS_HOME_NAME = "Птичник";
    private static final String CATS_HOME_NAME = "Кошатник";
////
    AnimalsHome<T1> aquarium;
    AnimalsHome<T2> birdsHome;
    CatsHome<T3> catsHome;

    public Zoo() {
        this.aquarium = new AnimalsHome<>(AQUARIUM_NAME);
        this.birdsHome = new AnimalsHome<>(BIRDS_HOME_NAME);
        this.catsHome = new CatsHome<>(CATS_HOME_NAME);
    }

    void addAnimal(T1 t1) {
        aquarium.animalsList.add(t1);
    }

    void addAnimal(T2 bird) {
        birdsHome.animalsList.add(bird);
    }

    void addAnimal(Cat cat) {
        catsHome.animalsList.add(cat);
    }

    @Override
    public String toString() {
        return "В зоопарке есть отделения для животных: " +
                aquarium.name +
                ", " + birdsHome.name +
                ", " + catsHome.name +
                "\nВ " + aquarium.name + "е живут: " + aquarium +
                "\nВ " + birdsHome.name + "е живут: " + birdsHome +
                "\nВ " + catsHome.name + "е живут: " + catsHome;
    }
}
