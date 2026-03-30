package study019_List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    /*
    * List系列集合独有的方法:
    * void add(int index,E element)       在此集合中的指定位置插入指定的元素
    * E remove( int index)                删除指定索引处的元素，返回被删除的元素
    * E set(int index, E element)         修改指定索引处的元素，返回被修改的元素
    * E get （ int index)                  返回指定索引处的元素
    */

    public static void main(String[] args) {
        //1.创建一个集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //3.指定位置插入指定元素
        //原索引上的元素会依次往后移
        list.add(1,"ddd");

        //4.删除指定位置的元素
        //remove有两种返回值，第一种是返回布尔类型的值
        boolean remove1 = list.remove("ddd");
        System.out.println(remove1);

        //第二种是返回被删除的元素
        String remove2 =  list.remove(1);
        System.out.println(remove2);

        //5.修改指定索引处的元素，返回被修改的元素
        String result = list.set(0,"qqq");
        System.out.println(result);

        //6.返回指定索引处的元素
        String s = list.get(1);
        System.out.println(s);
        //打印集合
        System.out.println(list);

    }
}
