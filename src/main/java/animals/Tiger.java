package animals;

public class Tiger extends Animal {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Tiger " + getName() + " is eating fresh meat");
    }

    @Override
    public void whereDoILive() {
        System.out.println(getName() + " lives in aviary");
    }
}
