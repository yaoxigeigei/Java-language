package day01;

import java.util.Scanner;

public class 三位数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //键盘录入一个三位数字
        System.out.println("请输入一个三位整数:");
        int a = scanner.nextInt();
        System.out.println(a%10);
        System.out.println(a/10%10);
        System.out.println(a/100%10);
    }
}
