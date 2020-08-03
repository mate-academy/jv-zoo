package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Animal tiger = new Tiger("orange", 5);

        Animal sparrow = new Sparrow("brown", 1);

        Animal shark = new Shark("grey", 3);

        Animal penguin = new Penguin("black", 2);


        Animal[] feedAnimals = new Animal[]{tiger, sparrow, shark, penguin};
        for (Animal feedAll : feedAnimals) {
            feedAll.feed();
        }
    }
}
