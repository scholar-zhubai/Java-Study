package study010;

//静态方法，被static修饰的方法叫做静态方法
//多用在测试类和工具类里面，在javabean里面很少使用
//静态方法只能访问非静态的成员变量和非静态的成员方法
//静态方法里面没有this关键字
//推荐使用类名调用，也可以用对象名调用

public class StudentTest {
    //方法会自动存入栈内存，而静态变量或者方法会自动在堆内存里面开辟一个静态存储区用来存储静态变量的值
    //静态变量是随着类加载而加载的，优先于对象的出现的，先加载静态类，再创建并加载对象
    public static void main(String[] args) {
        //静态变量可以直接用类名来调用，下面的每个对象都会自动调用
        //推荐使用类名调用
        Student.teacherName = "老师";

        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("男");
        //s1.teacherName = "teacher";

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(18);
        s2.setGender("男");

        s2.study();
        s2.show();
    }
}

