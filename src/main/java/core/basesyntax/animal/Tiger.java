package core.basesyntax.animal;

public class Tiger extends Animal {

    public Tiger(String name, int age, boolean isRare) {
        super(name, age, isRare);
    }

    @Override
    public void feed() {
        System.out.println("Give " + getName() + " some meat");
    }

    @Override
    public String toString() {
        return "Tiger: " + getName() + ", age: " + getAge();
    }
}
