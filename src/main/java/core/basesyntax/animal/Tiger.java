package core.basesyntax.animal;

public class Tiger extends Animal {

    public Tiger(String name, int age, boolean isRare) {
        super(name, age, isRare);
    }

    @Override
    void feed() {
        System.out.println("Give tiger some meat");
    }

    @Override
    public String toString() {
        return "Tiger: " + getName() + ", age: " + getAge();
    }
}
