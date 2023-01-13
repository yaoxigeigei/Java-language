//模拟用户登录
import java.util.Scanner;

public class stringTest01 {
    public static void main(String[] args) {

        //创建用户的正确信息
        String rightName = "李四";
        String rightPassword = "123456789";

        //键盘录入用户的信息
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入你的名字:");
            String userName = sc.next();
            System.out.print("请输入你的密码:");
            String userPassword = sc.next();

            //判断是否正确
            if(rightName.equals(userName)&&rightPassword.equals(userPassword)){
                System.out.println("密码正确,登陆成功");
                break;
            }else{
                if(i==2){
                    System.out.println("次数用完了,账号被冻结,请联系客服修改密码");
                }else {
                    System.out.println("密码错误,请重新输入,还剩"+(2-i)+"次机会");
                }
            }

        }




    }
}
