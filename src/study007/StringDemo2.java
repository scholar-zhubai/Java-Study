package study007;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;

        while (true) {
            System.out.println("请录入一个金额:");
            money = sc.nextInt();

            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }


        String moneyStr = "";

        while (true){
            int ge  = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr += capitalNumber;

            //可以加一个反转字符串的函数


            money /= 10;
            if(money == 0){
                break;
            }
        }
    }

    //把阿拉巴数字变成大写的中文
    public static String getCapitalNumber(int number) {
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
