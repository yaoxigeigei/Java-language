import java.util.Scanner;

public class 重载方法之判断数组中是否存在一个数 {
    public static void main(String[] args) {
        int arr[]={1,3,5,4,68,7,6,4,421,561,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要判断的数字:");
        int number = sc.nextInt();
        //开始判断 并输入数字
        boolean a=panduan(number,arr);
        System.out.println(a);
    }

    public static boolean panduan(int number, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(number==arr[i]){
                return true;
            }
        }
        return false;
    }
}
