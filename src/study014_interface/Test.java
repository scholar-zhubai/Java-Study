package study014_interface;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("Amy",12);
        System.out.println(f.getName() + ", " + f.getAge());

        f.eat();
        f.swim();

        Rabbit r = new Rabbit("Sam",12);
        System.out.println(r.getName() + ", " + r.getAge());

        r.eat();
    }
}
