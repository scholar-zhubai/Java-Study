package study009;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //添加
        boolean result = list.add("aaa");
        list.add("vvv");
        list.add("ccc");
        System.out.println(result);
        System.out.println();

        //删除
        boolean result1 = list.remove("aaa");
        boolean result2 = list.remove("aa");

        String str = list.remove(0);
        System.out.println(str);

        list.remove("vvv");

        System.out.println(result1);
        System.out.println(result2);

        System.out.println();

        //修改
        String result3 = list.set(0,"ddd");
        System.out.println(result3);

        System.out.println();

        //查询
        list.add("ttt");
        list.add("ddd");
        
        String s = list.get(0);
        System.out.println(s);

        System.out.println();

        //遍历
        for (int i = 0; i < list.size(); i++) {
           String str1 =  list.get(i);
            System.out.println(str1);
        }

        System.out.println(list);
    }
}
