/*
    定义Javabean类:Phone
    Phone属性: 品牌，价格。
    main方法中定义一个集合，存入三个手机对象。
    分别为:小米，1000。苹果，8000。锤子2999.
    定义一个方法，将价格低于3000的手机信息返回
*/

import java.util.ArrayList;

public class ArrayListTest05 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<ArrayListTest05Phone> list = new ArrayList<>();
        //创建手机对象
        ArrayListTest05Phone p1 = new ArrayListTest05Phone("小米", 1000);
        ArrayListTest05Phone p2 = new ArrayListTest05Phone("苹果", 8000);
        ArrayListTest05Phone p3 = new ArrayListTest05Phone("锤子", 2999);
        //添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //查找价格低于3000的手机
        ArrayList<ArrayListTest05Phone> list1 = getPhoneInfo(list);
        //打印信息
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("手机信息为:"+list1.get(i).getBrand()+","+list1.get(i).getPrice());
        }
    }

    public static ArrayList<ArrayListTest05Phone> getPhoneInfo(ArrayList<ArrayListTest05Phone> list) {
        ArrayList<ArrayListTest05Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                result.add(list.get(i));
            }
        }
        return result;
    }


}
