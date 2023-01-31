/*
    需求:定义一个集合，添加一些学生对象，并进行遍历
    学生类的属性为:姓名，年龄
    必须是键盘录入
*/
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest03pro {
    public static void main(String[] args) {
        //创建集合
        AbstractList<ArrayListTest03Student> list = new ArrayList<>();
        //键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建学生对象
            ArrayListTest03Student stu = new ArrayListTest03Student();
            //键盘录入信息
            System.out.print("请输入你的姓名:");
            String name = sc.next();
            System.out.print("请输入你的年龄:");
            int age = sc.nextInt();
            //存储学生信息
            stu.setName(name);
            stu.setAge(age);
            //将信息存入集合
            list.add(stu);
        }
        //遍历
        for (int i = 0; i < list.size(); i++) {
            ArrayListTest03Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }

    }
}
