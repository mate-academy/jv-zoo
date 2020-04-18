package core.basesyntax;

public class App {
    public static void main(String[] args) {
        Zoo<Animal, Bird, Fish> zoo = new Zoo<>();
        Animal tiger_arrr = new Tiger("I am a tiger arrr");
        Animal tiger_miu = new Tiger("I am the second one miu");
        Bird sparrow = new Sparrow("Bob");
        Bird penguin = new Penguin("I can't fly:(");
        Fish shark = new Shark("Shon");
        zoo.animals.add(tiger_arrr);
        zoo.animals.add(tiger_miu);
        zoo.birds.add(sparrow);
        zoo.birds.add(penguin);
        zoo.fishes.add(shark);
    }
}
