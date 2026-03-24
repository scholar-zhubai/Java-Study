package study003;

//评委打分


import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int[] scoreArr = getScores();
        int sum = getSum(scoreArr);
        int max = getMax(scoreArr),min = getMin(scoreArr);
        int avg = (sum - max -min)/4;

        System.out.print("平均分为：");
        System.out.println(avg);
        //System.out.println(scorArr[i]);
    }
    
    public static int getMax (int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max){
                max = scoreArr[i];
            }
        }

        return max;
    }

    public static int getMin (int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min){
                min = scoreArr[i];
            }
        }

        return min;
    }

    public static int getSum (int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }

    public  static int[] getScores () {
        //六位评委打分，要去掉最高分和最低分，再求平均分
        int[] scores = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("请输入评委的打分：");
            int score = sc.nextInt();
            scores[i] = score;
        }

        return scores;
    }
}
