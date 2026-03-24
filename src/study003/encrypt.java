package study003;

public class encrypt {
    public static void main(String[] args) {
        int number = 123456;
        int temp = number;
        int count = 0;

        while (number != 0){
            number /= 10;

            count++;
        }

        int[] arr = new int[count];

        while (temp != 0){
            int ge = temp % 10;
            temp /= 10;
            arr[count-1] = ge;
            count--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
