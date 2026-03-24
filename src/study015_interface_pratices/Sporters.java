package study015_interface_pratices;

public abstract class Sporters extends Person{
    public Sporters() {
    }

    public Sporters(String name, int age) {
        super(name, age);
    }

    public abstract void Study();
}
