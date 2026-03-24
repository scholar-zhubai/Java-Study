package study011;

//工具类
//帮助我们做一些事情，但是不描述任何事物的类
//类名要见名知意
//构造方法要私有化
//方法定义为静态

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = ArrayUtil.printfArr(arr);
        System.out.println(str);

        double[] arr1 = {1.1,3.4,5.5};
        double average = ArrayUtil.getAverage(arr1);
        System.out.println(average);
    }
}
