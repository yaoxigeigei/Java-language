/*
    需求:
    1.main方法中定义一个集合，
    存入三个用户对象用户属性为:id，username，password
    2.定义一个方法，根据id查找对应的用户信息。
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest04 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<ArrayListTest04Student> list = new ArrayList<>();
        //创建三个用户对象
        ArrayListTest04Student stu1 = new ArrayListTest04Student(1, "张三", "1");
        ArrayListTest04Student stu2 = new ArrayListTest04Student(2, "李四", "2");
        ArrayListTest04Student stu3 = new ArrayListTest04Student(3, "小武", "3");
        //将对象放入数组当中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //定义查找方法
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要查找的人的ID:");
        while (true) {
            int id = sc.nextInt();
            int flag = getIndex(list,id);
            if(flag>=0){
                System.out.println("信息为:"+list.get(flag).getId()+","+list.get(flag).getUsername()+","+list.get(flag).getPassword());
                break;
            }else{
                System.out.print("你查找的ID不存在,请重新输入:");
            }
        }
    }

    //查找是否存在的方法
    public static boolean contains(ArrayList<ArrayListTest04Student> list, int id) {
/*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                return true;
            }
        }
*/
        return getIndex(list, id) >= 0;

    }

    //查找并且返回索引
    public static int getIndex(ArrayList<ArrayListTest04Student> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
