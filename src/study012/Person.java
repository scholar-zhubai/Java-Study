package study012;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog dog){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getColor() + "颜色的" + animal.getAge() + "的狗");
            dog.eat(something);
        }else if (animal instanceof Cat cat){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getColor() + "颜色的" + "年龄为" + animal.getAge() + "岁的狗");
            cat.eat(something);
        }
    }
}
