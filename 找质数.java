//判断101-200之间的质数,并全部输出  统计多少个
public class 找质数 {
    public static void main(String[] args) {
        //创建总和变量数
        int count = 0;
        //先将要求的数循环出来
        for (int i = 101; i <= 200; i++) {
            //判断每一个数是否是质数
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i % j ==0){
                    flag=false;
                    //break跳出内循环
                    break;
                }
            }
            if(flag){
                count++;
                System.out.println("质数:"+i);
            }
        }
        System.out.println("一共有"+count+"个质数");
    }
}
