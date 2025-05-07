package core.basesyntax.models.animals;

public class Tiger extends Animal {

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void feed() {
        System.out.printf("Tiger %s is eating now\n", name);
    }

    @Override
    public void doSomething() {
        System.out.printf("%s is chilling now...", this.getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
