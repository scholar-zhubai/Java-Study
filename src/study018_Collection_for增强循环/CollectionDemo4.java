package study018_Collection_for增强循环;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();

        coll.add("zhansan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.利用增强for进行遍历
        for (String s : coll){
            System.out.println(s);
        }

        //3.快捷生成方式  数组名.for

        //4.修改增强for中的变量，不会改变集合原本的数据

    }
}
