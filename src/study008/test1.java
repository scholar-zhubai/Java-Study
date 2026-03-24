package study008;

//A每次循环将首字母调到最后面，若在若干次调用后能得到B，则返回True；

public class test1 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";

        String rotate = rotate(strA);

        boolean result = check(strA,strB);

        System.out.println(result);

    }

    public static boolean check(String A,String B){
        for (int i = 0; i < A.length(); i++) {
            A = rotate(A);
            if (A.equals(B)){
                return true;
            }
        }
        return false;
    }

    public static String rotate (String str) {
        char first = str.charAt(0);

        String end = str.substring(1);

        return end + first;
    }
}
