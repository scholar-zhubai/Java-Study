package study012;

public class Test {
    public static void main(String[] args) {
        Person p = new Person(66,"老王");

        Dog d = new Dog(2,"黑");
        Cat c = new Cat(3,"黑");

        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼干");

    }
}
