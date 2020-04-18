package core.basesyntax.animals.cats;

public class Tiger extends Cat {
    String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Tiger " + name + " was fad");
    }

    @Override
    public void purr() {
        System.out.println("Tiger " + name + " is purring");
    }
}
