/*
        给定两个以字符串形式表示的非负整数num1和num2，
        返回num1和num2的乘积，它们的乘积也表示为字符串形式。
*/
public class stringTest16 {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        //将字符串变为字符数组
        char arr1[] = num1.toCharArray();
        char arr2[] = num2.toCharArray();
        //将字符数组变为整数
        int a = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(i==0){
                a=arr1[i]-48;
            }else{
                a=a*10+(arr1[i]-48);
            }
        }

        int b= 0;
        for (int i = 0; i < arr2.length; i++) {
            if(i==0){
                b=arr2[i]-48;
            }else{
                b=b*10+(arr2[i]-48);
            }
        }
        int total = a*b;
        String str = ""+total;
        System.out.println(str);

    }
}
