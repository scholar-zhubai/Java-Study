package study017_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // Collection是一个接口，不能直接创建对象
        // 在学习他的方法时，只能创建他的对象

        Collection<String> coll = new ArrayList<>();
        // 1.添加元素
        // 细节 1 ：如果我们要往 List 系列集合中添加数据，那么方法永远返回 true ，因为 List 系列的是允许元素重复的。
        // 细节 2 ：如果我们要往 set 系列集合中添加数据，
        // 如果当前挚添加元素不存在，方法返回 true• 表示添加成功。
        // 如果当前要添加的元素己经存在，方法返回 false ，表示添加失败。
        // 因为 set 系列的集合不允许重复。

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        System.out.println(coll);

        //2.清空
        //coll.clear();

        System.out.println(coll);

        //3.删除
        //细节 1 ：因为 Collection 里面定义的是共性的方法，所以此时不能通过索引进行删除。只能通过元素的对象进行删除。
        //细节 2 ：方法会有一个布尔类型的返回值，删除成功返回 true ，删除失败返回 false
        //如果要删除的元素不存在，就会删除失败。

        System.out.println(coll.remove("aaa"));
        System.out.println(coll);

        // 4.判断元素是否存在
        // 细节：底层是依赖 equals 方法进行判断是否存在的。
        // 所以，如果集合中存储的是定义对象，也想通过 c 。 nt 毓 ns 方法来判断是否包含，那么在 javabean 类中，一定要重写 equals 方法。
        boolean result1 = coll.contains("bbb");
        System.out.println(result1);

        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        //6.获取集合的长度
        int size = coll.size();
        System.out.println(size);
    }
}
