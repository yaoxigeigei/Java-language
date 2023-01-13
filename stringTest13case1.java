/*
    给定两个字符串,A和B。
    A的旋转操作就是将A最左边的字符移动到最右边例如,
    若A='abcde，在移动一次之后结果就是bcdea'如果在若干次调整操作之后，
    A 能变成B，那么返True。如果不能匹配成功，则返回false
*/
public class stringTest13case1 {
    public static void main(String[] args) {
        //定义两个字符串
        String A = "abc";
        String B = "bca";
        //进行调整 检查
        boolean flag = check(A,B);
        System.out.println(flag);

    }

    //作用:进行旋转操作
    public static String rotate(String str){
        char first = str.charAt(0);
        String end = str.substring(1);
        return end+first;
    }

    //作用:检查是否一样
    public static boolean check(String A,String B){
        for (int i = 0; i < A.length(); i++) {
            A = rotate(A);
            if(A.equals(B)){
                return true;
            }
        }
        return false;
    }
}
