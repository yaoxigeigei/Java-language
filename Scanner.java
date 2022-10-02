//导包
import java.util.Scanner;

public class Scanner{
	public static void main(String[] args){
		//创建对象
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入整数a:");
		//接收数据
		int a =scanner.nextInt();
		System.out.println("输入整数b:");
		//接收数据
		int b =scanner.nextInt();
		System.out.println("它们的和是");
		//输出结果
		System.out.println(a+b);
	}
}