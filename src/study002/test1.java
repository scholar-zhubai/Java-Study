package study002;

//开发验证码

import javax.crypto.spec.PSource;
import java.util.Random;

public class test1 {
    public static void main (String[] args){
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25){
                chs[i] = (char)(97 + i);
            }else{
                chs[i] = (char)(65 + i - 26);
            }

        }
        //定义一次字符串的变量，用来记录最终的结果

        String result = "";

        Random r = new Random();
    //随机抽四次
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            //System.out.println(chs[randomIndex]);
            //拼接字符串
            result += chs[randomIndex];
        }

        //随机抽一个数字0~9
        int number = r.nextInt(10);

        result += number;

        System.out.println(result);
    }

}
