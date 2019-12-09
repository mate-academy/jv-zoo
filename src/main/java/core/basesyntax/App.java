package core.basesyntax;

public class App {
    public static void main(String[] args) {
        Animal animal1 = new Sparrow("sparrow");
        Animal animal2 = new Penguin("penguin");
        Animal animal3 = new Shark("shark");
        Animal animal4 = new Tiger("tiger");

        Zoo zoo = new Zoo();
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);

        zoo.showAllAnimals();
        zoo.feedAll();
        zoo.showAllAnimals();
    }
}
