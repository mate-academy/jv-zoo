package animals;

import areas.Oceanarium;
import interfaces.Swimmable;

public class Penguin extends Animal implements Swimmable, Oceanarium {
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    @Override
    public void doEat() {
        System.out.println("Пингвинчик " + getName() + " кушает рыбку");
    }

    @Override
    public void doSwim() {
        System.out.println("Пингвинчик " + getName() + " плавает по океанариуму. Буль-буль");
    }

    @Override
    public void doILiveInOceanarium() {
        System.out.println(getName() + " живет в океанариуме и немножко очкует акулы");
    }
}
