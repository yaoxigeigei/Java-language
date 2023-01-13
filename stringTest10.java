/*
    键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
    对称字符串:123321、111
    非对称字符串:123123
*/

import java.util.Scanner;

public class stringTest10 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = sc.next();
        //将该字符串改变为StringBuilder类型方便操作 并将其反转
        String str1 = new StringBuilder().append(str).reverse().toString();
        //判断是否是对称字符串
        if (str.equals(str1)) {
            System.out.println("该字符串是对称字符串");
        }else {
            System.out.println("该字符串不是对称字符串");
        }

    }
}
