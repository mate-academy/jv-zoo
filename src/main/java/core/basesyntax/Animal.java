package core.basesyntax;

abstract public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    void eat(String s) {
        System.out.println("I am animal and I am ate " + s);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age + "\n";
    }
}
