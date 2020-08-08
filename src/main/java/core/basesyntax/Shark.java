package core.basesyntax;

public class Shark extends ZooAnimals implements Swimmable {

    public Shark(String name) {
        super(name);
        aviary = aviary.WATER;
    }

    @Override
    public void toFeed() {
        System.out.println("Shark is  full, thank you");
    }

    @Override
    public void toSwim() {
        System.out.println("Shark can swim");
    }

}
