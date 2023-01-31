/*
    需求:定义一个集合，添加一些学生对象，并进行遍历
    学生类的属性为:姓名，年龄
*/
import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListTest03 {
    public static void main(String[] args) {
        //创建集合
        AbstractList<ArrayListTest03Student> list = new ArrayList<>();
        //创建学生对象
        ArrayListTest03Student stu1 = new ArrayListTest03Student("张三",18);
        ArrayListTest03Student stu2 = new ArrayListTest03Student("李四",19);
        //添加元素
        list.add(stu1);
        list.add(stu2);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            ArrayListTest03Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
