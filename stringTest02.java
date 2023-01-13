//键盘录入一个字符串并且将其一个一个输出出来

import java.util.Scanner;

public class stringTest02 {
    public static void main(String[] args) {
        System.out.print("请输入一个字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            System.out.println(a);
        }

    }
}
