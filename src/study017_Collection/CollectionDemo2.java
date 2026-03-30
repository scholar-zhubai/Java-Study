package study017_Collection;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //1.创建集合对象
        Collection<Student> coll = new ArrayList<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan", 15);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 27);

        //3.把学生添加到集合当中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.判断集合中是否包括某一个学生
        Student s4 = new Student("wangwu", 27);
        // 因为 contains 方法在底层依赖 equals 方法判断对象是否一致的。
        // 如果存的是自定义对象，没有重写 equals 方法，那么默认使用 0bject 类中的 equals 方法进行判断，而 0bject 类中 equals 方法，依赖地址值进行判断。
        // 需求：如果同姓名和同年龄，就认为是同一个学生。
        // 所以，需要在自定义的 javabean 类中，重写 equals 方法就可以了。
        System.out.println(coll.contains(s4));
    }
}
