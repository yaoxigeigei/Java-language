import java.util.Scanner;

/*机票价格按照淡季旺季售卖,头等舱经济舱 输入机票原价,月份和头等舱或经济舱
规则:旺季(5-10月)头等舱9折,经济舱8.5折     淡季(11-来年4月)头等舱7折,经济舱6.5折*/

public class 卖飞机票 {
    public static void main(String[] args) {
        //插入输入函数
        Scanner sc = new Scanner(System.in);
        //创建变量记录数据
        System.out.print("请输入你的机票原价:");
        double price = sc.nextDouble();
        System.out.print("亲输入你坐的什么舱: (0:头等舱  1:经济舱)");
        int cabin = sc.nextInt();
        System.out.print("输入你购票的月份: (1-12)");
        int month = sc.nextInt();
        double sole =shippingSpace(price,cabin,month);
        System.out.println("你的机票价格是:"+sole);
        }

    public static double shippingSpace(double price,int Space,int month) {
        if (Space == 0) {
            switch (month) {
                case 5, 6, 7, 8, 9, 10:
                    return price * 0.9;
                case 1, 2, 3, 4, 11, 12:
                    return price * 0.85;
            }
        } else {
            switch (month){
                case 5, 6, 7, 8, 9, 10:
                    return price * 0.7;
                case 1, 2, 3, 4, 11, 12:
                    return price * 0.65;
            }
        }
        return 0;
    }



}
