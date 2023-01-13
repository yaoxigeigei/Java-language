/*
    给定两个字符串,A和B。
    A的旋转操作就是将A最左边的字符移动到最右边例如,
    若A='abcde，在移动一次之后结果就是bcdea'如果在若干次调整操作之后，
    A 能变成B，那么返True。如果不能匹配成功，则返回false
*/
public class stringTest13case2 {
    public static void main(String[] args) {
        //定义两个字符串
        String A = "abc";
        String B = "cab";
        //旋转 判断
        System.out.println(check(A,B));

    }
    //作用:旋转
    public static String rotate(String A){
        char arr[] = A.toCharArray();
        char first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        return new String(arr);
    }

    //作用:判断
    public static boolean check(String A,String B){
        for (int i = 0; i < A.length(); i++) {
            A=rotate(A);
            if(A.equals(B)){
                return true;
            }
        }
        return false;
    }

}
