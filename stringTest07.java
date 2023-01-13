//手机号隐藏 134654882236  134****2246 subString
import java.util.Scanner;

public class stringTest07 {
    public static void main(String[] args) {
        //获取手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的手机号:");
        //对手机号做出判断
        String phoneNumber;
        while (true) {
            phoneNumber = sc.next();
            if (phoneNumber.length() != 11) {
                System.out.print("手机号输入错误,请重新输入:");
            } else {
                System.out.println("输入正确");
                break;
            }
        }
        //隐藏手机号
        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7);
        //输出隐藏手机号
        String phoneNewNumber = start + "****" + end;
        System.out.println("加密后的手机号为:"+phoneNewNumber);


    }
}
