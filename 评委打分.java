import java.util.Scanner;

/*在唱歌比赛中,有6名评委给选手打分,分数范围是[0-100]之间的整数.
选手的最后得分为:去掉最高分最低分的最后4各评委的平均分
请完成上述的过程并计算出选手的得分*/
public class 评委打分 {
    public static void main(String[] args) {
        //定义一个数组存入6各评委的分数
        int arr[]=new int[6];
        //键盘录入6各评委的分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("请输入"+(i+1)+"号评委打的分数:");
            int score = sc.nextInt();
            if(score<0 || score>100){
                System.out.print("请重新输入"+(i+1)+"号评委打的分数:");
                score = sc.nextInt();
                arr[i]=score;
            }else {
                arr[i] = score;
            }
        }
        //设置一个变量记录最高分
        int max = arr[0];
        //找到最高分
        for (int i = 1; i < 6; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //设置一个变量记录最低分
        int min = arr[0];
        //找到最低分
        for (int i = 1; i < 6; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //求出总分数
        int count = 0;
        for (int i = 0; i < 6; i++) {
            count = count + arr[i];
        }
        int number = count - max -min;
        System.out.println("选手最后得分"+number/4);
    }
}
