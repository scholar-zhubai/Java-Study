package study008;


import java.util.Scanner;

public class luomaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            System.out.println("请输入一个字符串:");
            str = sc.next();

            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("字符串错误，请重新输入:");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - '0';
            String s = changeluoma(number);
            sb.append(s);
        }

        System.out.println(sb);
    }

    public static String changeluoma(int number) {
        String[] arr = {"","Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ", "Ⅹ"};
        return arr[number];
    }


    public static boolean checkStr(String str) {
        //长度要小于9
        if (str.length() > 9) {
            return false;
        }

        //只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }
}
