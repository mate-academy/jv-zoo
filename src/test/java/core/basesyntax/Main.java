package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Sparrow sparrow = new Sparrow();
        Shark shark = new Shark();
        Penguin penguin = new Penguin();

Zoo[] zooAnimals = new Zoo[]{tiger,sparrow,shark,penguin};
for (Zoo feedAnimals : zooAnimals){
    feedAnimals.feed();
}
    }
}
