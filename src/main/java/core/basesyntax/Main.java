package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Zoo cityZoo = new Zoo("City Zoo");

        Tiger tiger = new Tiger("Survivor");
        Penguin penguin = new Penguin("Kinder Pingui");
        Sparrow sparrow = new Sparrow("Captain Jack");
        Shark shark = new Shark("Jaws");

        cityZoo.addAnimal(tiger);
        cityZoo.addAnimal(penguin);
        cityZoo.addAnimal(sparrow);
        cityZoo.addAnimal(shark);

        tiger.walk();
        penguin.fly();
        penguin.swim();
        sparrow.fly();
        shark.swim();

        cityZoo.feedAnimals();
    }
}
