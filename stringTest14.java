import java.util.Random;
import java.util.Scanner;

//键盘输入一个字符串打乱顺寻
public class stringTest14 {
    public static void main(String[] args) {
        //录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = sc.next();
        //打乱顺序
        System.out.println(upset(str));
    }
    //作用:打乱顺序
    public static String upset(String str){
        //字符串变数组
        char arr[] = str.toCharArray();
        //引入随机变量
        Random rdm = new Random();
        //打乱顺序
        for (int i = 0; i < arr.length; i++) {
            int random = rdm.nextInt(arr.length);
            char temp = arr[i];
            arr[i]=arr[random];
            arr[random]=temp;
        }
        return new String(arr);
    }
}
