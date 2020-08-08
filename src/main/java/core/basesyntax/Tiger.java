package core.basesyntax;

public class Tiger extends ZooAnimals implements Walkable, Feedable {

    public Tiger(String name) {
        super(name);
        aviary = aviary.LAND;
    }

    @Override
    public void toWalk() {
        System.out.println("Tiger can walk fast");
    }

    @Override
    public void toFeed() {
        System.out.println("Tiger is full, thank you");
    }
}
