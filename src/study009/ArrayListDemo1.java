package study009;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("你好！");
        list.add("我不好！");
        list.add("你并不好！");
        list.add("大家好！");

        System.out.print("[");

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + " ");
            }
        }

        System.out.println("]");
    }
}
