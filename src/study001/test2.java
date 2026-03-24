package study001;

import java.sql.SQLOutput;
import java.util.Scanner;

//买飞机票的问题

public class test2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入机票的原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份：");
        int montg = sc.nextInt();
        System.out.println("请输入当前的舱位：0是头等舱，1是经济舱");

    }
}

