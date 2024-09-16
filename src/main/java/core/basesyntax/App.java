package core.basesyntax;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal tigerArrr = new Tiger("I am a tiger arrr");
        Animal tigerMiu = new Tiger("I am the second one miu");
        Bird sparrow = new Sparrow("Bob");
        Bird penguin = new Penguin("I can't fly:(");
        Fish shark = new Shark("Shon");
        zoo.addBird(sparrow);
        zoo.addBird(penguin);
        zoo.addFish(shark);
        zoo.addAnimal(tigerArrr);
        zoo.addAnimal(tigerMiu);
        zoo.feedBirds();
        zoo.feedAnimals();
        zoo.feedFishes();
    }
}
