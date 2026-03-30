package study018_Collection_lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo5 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();

        coll.add("zhansan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.利用lambada进行遍历
        //利用匿名内部类的形式
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println();

        //lambda表达式
        coll.forEach(s -> System.out.println(s));
    }
}
