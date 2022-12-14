import java.util.Random;

/* 需求:
    一个大V直播抽奖，奖品是现金红包，分别有{2，588 ，888，1000，10000}五个奖金。
    请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
    打印效果如下:(随机顺序，不一定是下面的顺序)
        888元的奖金被抽出
        588元的奖金被抽出
        10000元的奖金被抽出
        1000元的奖金被抽出
        2元的奖金被抽出
*/
public class 直播抽奖方法二优化版 {
    public static void main(String[] args) {
        //创建数组放入奖金金额
        int arr[] = {2, 588, 888, 1000, 10000};
        //创建随机函数
        Random rdm = new Random();
        //打乱奖池内的顺序
        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            int number = rdm.nextInt(5);
            temp=arr[i];
            arr[i]=arr[number];
            arr[number]=temp;
        }


        //打印奖项
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"元的奖金被抽出");
        }
    }
}
