import java.util.Scanner;

/*规则:
    先得到每位数,然后将每位数都加上5,
    在对10求余,最后将所有数字反转,
    得到一串新的数字
 */
public class 数字加密 {
    public static void main(String[] args) {
        //1:先录入一个待加密的数字
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要加密的数字:");
        int oldNumber = sc.nextInt();

        //求出待加密数字的位数
        //方法一:(利用while循环求出)
        int number1 = getNumber1(oldNumber);
        //方法二:(利用int的最大位数)
        int number2 = getNumber2(oldNumber);
        //创建一个数组放入没加密过的数字
        int arr[] = new int[number2];
        for (int i = arr.length-1; i >=0; i--) {
            arr[i]=oldNumber%10;
            oldNumber=oldNumber/10;
        }
        //2:加密
        //每位数字都加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //将所有数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //打印加密后的数字
        int Number = 0;
        for (int i = 0; i < arr.length; i++) {
            Number = Number * 10 + arr[i];
        }
        System.out.println(Number);

    }

    //方法一:(求int值的位数)
    public static int getNumber1(int number) {
        int a=0;
        while (number != 0) {
            number=number/10;
            a++;
        }
        return a;
    }

    //方法二:(求int值的位数)
    public static int getNumber2(int number) {
        int arr[]={9,99,999,9999,99999,999999,9999999,99999999,999999999};
        for(int i= arr.length-1;i>=0;i--){
            if(number>arr[i]){
                return i+2;
            }
        }
        return 0;
    }




}
