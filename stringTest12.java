import java.util.Scanner;

/*
        键盘录入一个字符串要求1:长度为小于等于9
        要求2:只能是数字
        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系:
        1 -1、1l 2、1l-3、IV-4、V -5、V-6、Vl- 7、VI-8、IX -9
        注意点:
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成”(长度为0的字符串)
*/
public class stringTest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //表格法 录入罗马数字
        String arr[] = {" ", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        while(true){
            //录入字符串
            System.out.print("请输入字符串:");
            String str = sc.next();
            //判断是否合法的字符串
            boolean flag = checkStr(str);
            if (flag) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    int a = str.charAt(i)-48;
                    sb.append(arr[a]);
                }
                str = sb.toString();
                System.out.println(str);
                break;
            } else {
                System.out.println("录入的字符串非法");
            }

        }

    }

    //检查字符串的方法
    public static boolean checkStr(String str) {
        //要求一:长度小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求二:判断是否是数字
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        //只有当所有循环结束后再返回true
        return true;
    }
}
