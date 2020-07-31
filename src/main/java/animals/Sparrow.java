package animals;

import areas.BirdAviary;
import interfaces.Flyable;

public class Sparrow extends Animal implements Flyable, BirdAviary {
    private String name;

    public Sparrow(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    @Override
    public void doFly() {
        System.out.println("Воробей " + getName() + " летает. Чирик чирик");
    }

    @Override
    public void doEat() {
        System.out.println("Воробей " + getName() + " кушает пшено. А лучше бы кушал мясо");
    }

    @Override
    public void doILiveInBirdAviary() {
        System.out.println(getName() + " живет в вольере для птиц и ему норм");
    }
}
