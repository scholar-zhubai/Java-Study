package study018_List_遍历方法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("1--------------");

        //2.增强for
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("2--------------");

        //3.lambada
        list.forEach(s -> System.out.println(s));

        System.out.println("3--------------");

        //4.普通for循环
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("4--------------");

        //5.列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向 0 索引的
        ListIterator<String> lit =  list.listIterator();
        while (lit.hasNext()){
            String str = lit.next();
            if ("bbb".equals(str)){
                lit.add("qqq");
            }
        }
        System.out.println(list);

        System.out.println("5--------------");
    }
}
