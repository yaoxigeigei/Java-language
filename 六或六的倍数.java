package day01;

import java.util.Scanner;

public class 六或六的倍数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //键盘录入两个整数
        System.out.println("输入第一个整数:");
        int a =scanner.nextInt();
        System.out.println("输入第二个整数:");
        int b =scanner.nextInt();
        boolean result = (a==6||b==6)||((a+b)%6==0);
        System.out.println(result);
    }
}
