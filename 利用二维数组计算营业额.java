/*      某商城每个季度的营业额如下: 单位(万元)
        第一季度:22,66,44
        第二季度:77,33,88
        第三季度: 25,45,65
        第四季度:11,66,99
        要求计算出每个季度的总营业额和全年的总营业额
 */
public class 利用二维数组计算营业额 {
    public static void main(String[] args) {
        int arr[][]={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int total=0;             //总营业额
        //每个季度的营业额
        for (int i = 0; i < arr.length; i++) {
            //1个季度的营业额
            int turnover =0;
            for (int j = 0; j < arr[i].length; j++) {
                turnover=turnover+arr[i][j];
            }
            System.out.println("第"+(i+1)+"季度的营业额是:"+turnover+"万元");
            total=total+turnover;
        }
        System.out.println("总营业额是"+total+"万元");

    }
}
