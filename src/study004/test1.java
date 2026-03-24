package study004;


//抽奖方式

import javax.swing.*;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        //定义奖池
        int[] arr = {88,888,8888};
        //定义新的抽奖结果
        int[] newArr = new int[arr.length];
        //抽奖
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖项
            int prize = arr[randomIndex];
            //判断奖项是否存在，存在就重新抽取，不存在就是有效奖项
            boolean flag = contains(newArr,prize);
            if (!flag){
                newArr[i] = prize;
                i++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
