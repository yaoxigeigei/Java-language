import java.util.Random;
import java.util.Scanner;

public class 模拟双色球 {
    public static void main(String[] args) {
        //1:随机出双色球的7个数字
        int arr1[] = new int[7];
        //引入随机函数
        Random rdm = new Random();
        //放入红色球
        for (int i = 0; i < 6; ) {
            int number1 = rdm.nextInt(33) + 1;
            //判断随机数是否相同
            if (contains(arr1, number1)) {
                arr1[i] = number1;
                i++;
            }
        }
        //放入蓝色球
        int number2 = rdm.nextInt(16) + 1;
        arr1[6] = number2;

        for (int i = 0; i < 7; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();


        //2:创建一个数组放入玩家的7个双色球数字
        Scanner sc = new Scanner(System.in);
        int arr2[] = new int[7];
        //红色球数字
        for (int i = 0; i < 6; ) {
            System.out.print("请输入你的第" + (i + 1) + "个红色球数字(红色球1-33  蓝色球1-16):");
            int numeral1 = sc.nextInt();
            if (contains(arr2, numeral1) && numeral1 >= 1 && numeral1 <= 33) {
                arr2[i] = numeral1;
                i++;
            } else if (numeral1 < 1 || numeral1 > 33) {
                System.out.println("该数字不合法");
            }else{
                System.out.println("该数字已经存在了");
            }
        }
        //蓝色球数字
        System.out.print("请输入你的第" + 7 + "个蓝色球数字(红色球1-33  蓝色球1-16):");
        while (true) {
            int numeral2 = sc.nextInt();
            if (numeral2 >= 1 && numeral2 <= 16) {
                arr2[6] = numeral2;
                break;
            } else {
                System.out.print("该数字不合法,请重新输入(蓝色球):");
            }
        }


        //3:判断玩家双色球和正确的双色球一样的个数
        int redBall = 0;
        int blueBall = 0;
        for (int i = 0; i < 6; i++) {
            if (arr1[i] == arr2[i]) {
                redBall++;
            }
        }
        if (arr1[6] == arr2[6]) {
            blueBall++;
        }

        //4:玩家赢的钱
        if ((redBall == 0 && blueBall == 1) || (redBall == 1 && blueBall == 1) || (redBall == 2 && blueBall == 1)) {
            System.out.println("六等奖 5元");
        } else if ((redBall == 4 && blueBall == 0) || (redBall == 3 && blueBall == 1)) {
            System.out.println("五等奖 10元");
        } else if ((redBall == 4 && blueBall == 1) || (redBall == 5 && blueBall == 0)) {
            System.out.println("四等奖 200元");
        } else if (redBall == 5 && blueBall == 1) {
            System.out.println("三等奖 3000元");
        } else if (redBall == 6 && blueBall == 0) {
            System.out.println("二等奖 10-20万元(具体奖金根据奖池变化)");
        } else if (redBall == 6 && blueBall == 1) {
            System.out.println("一等奖 最高1000万元(正常一般500万元,具体奖金根据奖池变化)");
        } else {
            System.out.println("谢谢参与");
        }


    }

    //判断数字是否存在与当前数组当中
    public static boolean contains(int arr[], int number) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                flag = false;
                return false;
            }
        }
        return true;
    }


}
