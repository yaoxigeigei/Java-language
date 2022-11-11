import java.util.Random;

public class 打乱数组中的数据 {
    public static void main(String[] args) {
        //定义储存1-5
        int arr[]={1,2,3,4,5};
        //引入随机变量
        Random r = new Random();
        //创建一个交换临时变量
        int temp = 0;
        int randomnumber = r.nextInt(arr.length);
        //开始随机交换
        for (int i = 0; i < arr.length; i++) {
            temp=arr[i];
            arr[i]=arr[randomnumber];
            arr[randomnumber]=temp;
        }
        //随机交换后打印出来
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
