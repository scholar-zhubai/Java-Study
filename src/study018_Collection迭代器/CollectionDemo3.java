package study018_Collection迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        //2.获取迭代器
        Iterator<String> it = coll.iterator();
        //3.利用循环去不断地获取集合中的每一个元素
        while (it.hasNext()) {
            //4.next方法的两件事：获取元素并不断移动指针
            String str = it.next();
            System.out.println(str);
        }
        //注意点：迭代器循环只能进行一次，并且循环玩后指针不会复位，此时指针指向最后没有元素的位置
        System.out.println(it.next()); // NoSuchElementException

        //如果再次进行遍历，只能重新获取一个新的迭代器对象
        //一个迭代器里面只能使用一个next，因为她同时获取元素和移动指针
        //迭代器遍历的时候只能使用其自带的方法，不能使用集合的方法进行增加和删除

        //迭代器遍历元素不依赖索引

    }
}
