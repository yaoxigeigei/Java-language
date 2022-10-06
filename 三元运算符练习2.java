package day01;

//一个寺庙里住着三个和尚,他们的身高分别为150 210 165 最高身高是多少
public class 三元运算符练习2 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;
        int temp = a > b ? a : b;
        System.out.println("最高身高是" + (temp > c ? temp : c));
    }
}
