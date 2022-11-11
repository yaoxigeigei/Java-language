import java.util.Random;
import java.util.Scanner;

public class 猜数字游戏 {
    public static void main(String[] args) {
        //1:创建一个随机数
        Random r = new Random();
        int number = r.nextInt(100)+1;   //1-100
        //2:键盘录入一个要猜的数字
        Scanner scanner = new Scanner(System.in);
        //判断要猜的数字和随机数是否一样
        while(true){
            System.out.println("请输入你要猜的数字:");
            int guessnumber = scanner.nextInt();
            if(guessnumber > number){
                System.out.println("猜大了");
            }else if(guessnumber == number){
                System.out.println("猜对了");
                break;
            }else{
                System.out.println("猜小了");
            }
        }

    }
}
 