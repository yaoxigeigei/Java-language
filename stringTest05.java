/*
    定义一个方法，实现字符串反转。
    键盘录入一个字符串，调用该方法后，
    在控制台输出结果例如，
    键盘录入 abc，输出结果 cba
*/
import java.util.Scanner;

public class stringTest05 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("输入你需要反转的字符串:");
        String str = sc.next();
        //调用方法
        stringReverse(str);

    }

    //创建方法
    public static void stringReverse(String str) {
        if(str==null){
            System.out.println("");
        }
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println("反转后的字符串是:" + result);
    }
}
