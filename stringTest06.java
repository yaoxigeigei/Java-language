//发票上的金额转化
import java.util.Scanner;

public class stringTest06 {
    public static void main(String[] args) {

        //一:录入金额做出判读
        //键盘录入金额
        Scanner sc = new Scanner(System.in);
        int money;    //定义变量
        while (true) {
            System.out.print("请输入你的金额(数字):");
            money = sc.nextInt();    //对变量进行赋值
            //对用户的数据进行判断
            if (money > 0 && money <= 9999999) {
                //金额有效

                break;
            } else {
                //金额无效
                System.out.println("你输入的金额无效");
            }
        }

        //二:定义一个方法 将数字变为大写的中文
        String moneyStr = getCapitalNumber(money);

        //三:将此中文增加到无单位的7位大写数字
        int remainderNumber = 7 - moneyStr.length();
        for (int i = 0; i < remainderNumber; i++) {
            moneyStr = "零" + moneyStr;
        }

        //四:插入单位
        String arr[] = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        for (int i = 0; i < 7; i++) {
            result=result+moneyStr.charAt(i)+arr[i];
        }
        System.out.println(result);

    }

    public static String getCapitalNumber(int money) {
        //定义数组 产生对应关系
        String arr[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        String result = "";
        while (money != 0) {
            result = arr[money % 10] + result;
            money = money / 10;
        }
        return result;
    }
}
