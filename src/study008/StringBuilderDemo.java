package study008;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        //添加元素
        /*sb.append(1);
        sb.append(2.3);
        sb.append(true);
        sb.append("jjj");*/

        //链式编程
        sb.append("aaa").append("bbb").append("ccc");

        //反转
        //sb.reverse();

        //可以把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);

        //获取长度
        int len = sb.length();
        System.out.println(len);

        System.out.println(sb);
    }
}
