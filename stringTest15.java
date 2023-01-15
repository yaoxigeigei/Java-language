import java.util.Random;

/*
    生成验证码
    内容:可以是小写字母，也可以是大写字母，还可以是数字
    规则:
    长度为5
    内容中是四位字母，1位数字。其中数字只有1位，但是可以出现在任意的位置。
*/
public class stringTest15 {
    public static void main(String[] args) {
        //一:先创建一个字符数组将大小写字母都放进去
        char cc = 'a';      //小写第一个
        char CC = 'A';      //大写第一个
        char arr[] = new char[52]; //创建数组
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                arr[i] = (char) (cc + i);
            } else {
                arr[i] = (char) (CC + (i - 26));
            }
        }
        //二:生成一个0-9的数字
        Random rdm = new Random();
        int number = rdm.nextInt(10);
        //创建一个放验证码的字符数组
        char verification[] = new char[5];
        //从字符数组中随机抽出4个字母并放入
        for (int i = 0; i < 4; i++) {
            int index = rdm.nextInt(52);
            verification[i] = arr[index];
        }
        //三:将最后一个数字放入
        String str = new String(verification); //变成字符串
        StringBuilder sb = new StringBuilder(str);
        //sb.append(number);
        //将最后一个数字打乱
        int newIndex = rdm.nextInt(3);
        str = sb.insert(newIndex,number).toString();
        System.out.println(str);

    }
}
