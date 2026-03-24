package study005;

import java.util.Scanner;

public class test   {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        //假如有个空格，那么只会接受空格前面的数据
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);

        System.out.println("请输入一个字符串：");
        String s1 = sc.nextLine();
        //这个nextline 里面可以输入字符串，空格，制表符等等，回车接受

    }
}
