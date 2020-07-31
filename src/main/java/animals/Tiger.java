package animals;

import areas.Aviary;

public class Tiger extends Animal implements Aviary {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    @Override
    public void doEat() {
        System.out.println("Тигр " + getName() + " кушает свежее мясо.");
    }

    @Override
    public void doILiveInAviary() {
        System.out.println(getName() + " живет в общем вольере и, кажется, он здесь совсем один");
    }
}
