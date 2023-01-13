//敏感词替换 replace
import java.util.Scanner;

public class stringTest09 {
    public static void main(String[] args) {

        //定义一个敏感词库
        String arr[]={"TMD","NMD","SB","傻逼","NM"};

        //录入说的话
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要发送的话:");
        String str = sc.next();

        //循环每一次替换敏感词
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i],"***");
        }
        System.out.println(str);
    }
}
