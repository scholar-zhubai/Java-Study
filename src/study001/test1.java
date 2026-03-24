package study001;

public class test1  {
    public static void main (String[] args){
        int[] arr = {1,23,44,57,91,44};

        boolean flag = contain (arr, 44);

        System.out.println(flag);
    }

    public static boolean contain(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
