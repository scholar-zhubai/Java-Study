import java.util.ArrayList;
import java.util.Scanner;

public class jisuan {
    // 存储k和对应的t（k为索引，t为值）
    private static ArrayList<Double> tList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //输入数据
        System.out.println("请输入k的数量（如8）：");
        int kCount = scanner.nextInt();
        System.out.println("请依次输入k=1到k=" + kCount + "对应的t值（单位：s）：");
        for (int i = 0; i < kCount; i++) {
            tList.add(scanner.nextDouble());
        }

        // 2. 选择计算的组（如k1&k5、k2&k6等）
        System.out.println("请输入每组间隔的k数（如4，即k1&k5）：");
        int interval = scanner.nextInt();
        System.out.println("请输入要计算的组数（如4）：");
        int groupCount = scanner.nextInt();

        // 3. 计算每组角加速度
        ArrayList<Double> betaList = new ArrayList<>();
        for (int i = 0; i < groupCount; i++) {
            int km = i + 1; // 第m个k（从1开始）
            int kn = km + interval;
            double tm = tList.get(km - 1); // 对应t的索引（从0开始）
            double tn = tList.get(kn - 1);

            // 代入公式计算（π取3.14）
            double numerator = 2 * 3.14 * (kn * tm - km * tn);
            double denominator = tm * tn * (tn - tm);
            double beta = numerator / denominator;
            betaList.add(beta);

            System.out.printf("第%d组（k=%d&k=%d）角加速度：%.4f rad/s²\n",
                    i + 1, km, kn, beta);
        }

        // 4. 计算平均值（取绝对值）
        double avgBeta = betaList.stream()
                .mapToDouble(Math::abs)
                .average()
                .orElse(0);
        System.out.printf("角加速度平均值（大小）：%.4f rad/s²\n", avgBeta);

        scanner.close();
    }
}