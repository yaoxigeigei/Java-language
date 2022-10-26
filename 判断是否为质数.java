import java.util.Scanner;

public class 判断是否为质数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int a = sc.nextInt();
        for (int i=2 ; i<a ; i++ ){
            if(a%i==0){
                System.out.println(a+"该数不是质数");
                break;
            }
            else {
                System.out.println(a+"该数是质数");
            }
        }
    }
}
