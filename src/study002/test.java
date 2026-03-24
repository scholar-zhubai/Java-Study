package study002;

//找数组中最大值

public class test {
    public static void main (String[] args) {
        int[] arr = {22,100,44,55,66};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
