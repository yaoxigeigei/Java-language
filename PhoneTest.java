public class PhoneTest {
    public static void main(String[] args) {
        //创建数组存储三个手机
        Phone arr[] = new Phone[3];

        //创建手机的对象
        Phone p1 = new Phone("小米", 1888, "黑灰");
        Phone p2 = new Phone("红米", 4564, "蓝");
        Phone p3 = new Phone("一加", 1153, "棕色");

        //把手机对象存储在数组当中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //获取三部手机的价格
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            count=count+arr[i].getPrice();
        }

        //输出平均价格
        System.out.println("平均价格是:"+count/arr.length);

    }
}
