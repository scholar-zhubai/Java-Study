package study005;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("xiaomi",1000,"yellow");
        Phone p2 = new Phone("redmi",2400,"red");
        Phone p3 = new Phone("bluemi",3800,"blue");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        double ave = sum * 1.0 / arr.length;

        System.out.println("平均价格为：");
        System.out.println(ave);

        System.out.println("低于平均价格的手机为：");

        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            if(phone.getPrice() <= ave){
                System.out.print(phone.getBrand() + " " + phone.getColor() + " " + phone.getPrice());
                System.out.println();
            }
        }
    }
}
