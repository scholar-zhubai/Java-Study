package study008;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");

        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();

        System.out.println(sj);
        System.out.println(len);

        String str = sj.toString();
    }
}
