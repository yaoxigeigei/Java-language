import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建一个数组存储三个汽车
        Car arr[] = new Car[3];

        //创建汽车对象,数据来源于键盘
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car car = new Car();
            //录入品牌
            System.out.println("请输入汽车的品牌:");
            String brand = sc.next();
            car.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车的价格:");
            Double price = sc.nextDouble();
            car.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车的颜色:");
            String colour = sc.next();
            car.setColour(colour);

            //将汽车对象添加到数组当中
            arr[i] = car;
        }

        //遍历汽车数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println("品牌:"+car.getBrand()+"价格:"+car.getPrice()+"颜色:"+car.getColour());
        }

    }
}
