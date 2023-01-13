//根据身份证号查看 该持有者的生日和性别 charAt
import java.util.Scanner;

public class stringTest08 {
    public static void main(String[] args) {
        //录入身份证号
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的身份证号:");
        String identityInformation;
        while (true) {
            identityInformation = sc.next();
            if (identityInformation.length() != 18) {
                System.out.print("输入错误,请重新输入:");
            }else{
                System.out.println("输入正确");
                break;
            }
        }
        //判断生日
        //142622 2003 05 14 521 X
        String year = identityInformation.substring(6,10);
        String month = identityInformation.substring(10,12);
        String day = identityInformation.substring(12,14);
        //判断性别
        char number =identityInformation.charAt(16);
        int number1 = number-48;
        char gender;
        if(number1%2==0){
            gender = '女';
        }else{
            gender = '男';
        }

        //打印信息
        System.out.println("持有者的出生年月日:"+year+"."+month+"."+day+"    性别是:"+gender);


    }
}
