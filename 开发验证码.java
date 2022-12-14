import java.util.Random;

/*题目需求
 *   定义方法随机产生一个5位的验证码
 *   验证码格式
 *   长度为5
 *   前四位是大写字母或者小写字母
 *   最后一位是数字
 * */
public class 开发验证码 {
    public static void main(String[] args) {
        //将大写字母和小写字母都放到一个数组里面
        char arr1[] = new char[52];
        for (int p = 0; p < 52; p++) {
            if (p <= 25) {
                //添加大写字母 利用Ascii表 并将其放入数组中
                for (int i = 0; i < 26; i++) {
                    arr1[i] = (char) (i + 65);
                }
            } else {
                //添加小写字母 利用Ascii表 并将其放入数组中
                for (int i = 26; i < 52; i++) {
                    arr1[i] = (char) (71 + i);
                }

            }
        }
        //添加数字
        int arr2[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //引入随机函数
        Random rdm = new Random();
        //完善代码
        System.out.println("验证码为:");
        //创建字符串将其连接起来
        String result = "";
        //四个随机字母
        for (int i = 0; i < 4; i++) {
            int number1 = rdm.nextInt(arr1.length);
            result = result + arr1[number1];
        }
        //随机一个数字
        int number2 = rdm.nextInt(10);
        result = result + number2;
        System.out.print(result);

    }

}
