import java.util.Random;

public class 数组遍历求和平均数比平均数小的数 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[]=new int[10];
        int total = 0;   //总数
        int temp = 0;    //统计比平均数小的数量的数值
        int average = 0;
        //将十个数据赋值
        for(int i=0;i<10;i++){
            int number = r.nextInt(100);
            arr[i]=number;
            total = arr[i]+total;
        }
        System.out.println("10个随机数的和"+total);
        //求数组的平均数
        average =total/arr.length;
        System.out.println("10个随机数的平均数"+average);
        //有多少个数据比平均数小
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<average){
                temp++;
            }
        }
        System.out.println("比平均数小的数有"+temp+"个");
        //遍历数组的所有值,验证答案
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
