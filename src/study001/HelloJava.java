package study001;

public class HelloJava {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 12, 4, 5 };

        int max = getMax(arr);

        System.out.println(max);

    }
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }

}