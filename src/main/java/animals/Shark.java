package animals;

import areas.Oceanarium;
import interfaces.Swimmable;

public class Shark extends Animal implements Swimmable, Oceanarium {
    private String name;

    private String getName() {
        return name;
    }

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void doEat() {
        System.out.println("Акула " + getName() + " кушает мясо. Много мяса");
    }

    @Override
    public void doSwim() {
        System.out.println("Акула плавает по океанариуму. Все напряглись, особенно пингвин");
    }

    @Override
    public void doILiveInOceanarium() {
        System.out.println(getName() + " живет в океанариуме и кайфует.");
    }
}
