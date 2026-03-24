package study003;

//数字加密需求．

// 某系统的数字密码（大于 0 ），比如 1983 ，采用加密方式进行传输。
// 规则如下：先得到每位数然后每位数都加上 5 ，再对 1 0 求余最后将所有数字反转，得到一串新数。

public class test2 {
    public static void main (String[] args){
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
        //数字交换
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number*10 + arr[i];
        }
        System.out.println(number);
    }


}
