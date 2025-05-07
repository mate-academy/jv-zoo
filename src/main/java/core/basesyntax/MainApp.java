package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Zoo animalsCare = new Zoo();
        Animal[] varietyOfAnimals = new AnimalsGenerator().fillRandomly(21);
        animalsCare.settleAnimals(varietyOfAnimals);
        animalsCare.deliverFood();
    }
}
