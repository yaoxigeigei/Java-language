//键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数

import java.util.Scanner;

public class stringTest03 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = sc.next();

        //统计该字符串的数字 字母
        //1:创建三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //判断该字符是什么
        for (int i = 0; i < str.length(); i++) {
            //遍历所有字符
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("小字母有" + smallCount + "个");
        System.out.println("数字有" + numberCount + "个");

    }
}
