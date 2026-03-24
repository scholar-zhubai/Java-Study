package study006;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1,"Amy",18);
        Student stu2 = new Student(2,"Sam",20);
        Student stu3 = new Student(3,"Daming",21);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4,"Tom",33);

        boolean flag = contains(arr,stu4.getId());

        if (flag){
            System.out.println("id存在");
        }else{
            int count = getCount(arr);
            if (count == arr.length){
                Student[] newArr = creatNewArr(arr);

                newArr[count] = stu4;

                printArr(newArr);
            }else{
                arr[count] = stu4;
                printArr(arr);
            }

        }

    }

    //定义一个函数用来判断唯一性
    public static boolean contains (Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];

            int sid = stu.getId();

            if(sid == id) {
                return true;
            }
        }

        return false;
    }

    //定义一个函数用来判断数组中已经存了多少个元素
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }


    //定义一个函数用来创建一个新的数组，然后把数组的数据挪到新数组中
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static void printArr (Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + " " + stu.getName() + " " +  stu.getAge() );
            }
        }
    }
}
