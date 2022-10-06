package day01;

import java.util.Scanner;

public class 三元运算符练习1 {
    public static void main(String[] args) {
        System.out.println("这个程序是判断两只老虎的体重是否相同");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重:");
        int a = scanner.nextInt();
        System.out.println("请输入第二只老虎的体重:");
        int b = scanner.nextInt();
        System.out.println( a==b ? "体重相同" : "体重不同");
    }
}
