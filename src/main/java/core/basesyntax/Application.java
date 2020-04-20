package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        Sparrow sparrow = new Sparrow("Jack");
        Penguin penguin = new Penguin("Rick");
        Tiger tiger = new Tiger("Fluffy");
        Shark shark = new Shark("Steve");

        Animal[] animals = {shark, sparrow, tiger, penguin};

        for (Animal animal : animals) {
            zoo.addAnimals(animal);
        }

        for (Animal animal : animals) {
            zoo.feedAnimals(animal);
        }

        for (Animal animal : animals) {
            zoo.printInfo(animal);
        }
    }
}
