package study007;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("@" + s2 + "!");

        String s3 = new String("abc");
        System.out.println(s3);

        char[] chs = {'a','x','c'};
        String s4 = new String(chs);
        System.out.println(s4);
    }
}
