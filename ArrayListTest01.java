/*
    需求:定义一个集合，添加字符串，
    并进行遍历遍历格式参照:[元素1,元素2,元素3]
*/
import java.util.ArrayList;
public class ArrayListTest01 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("我");
        list.add("是");
        list.add("谁");
        list.add("?");
        //打印格式
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");

    }
}
