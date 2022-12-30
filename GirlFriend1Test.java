public class GirlFriend1Test {
    public static void main(String[] args) {

        //定义数组存储4个对象
        GirlFriend1 arr[] = new GirlFriend1[4];

        //创建对象
        GirlFriend1 g1 = new GirlFriend1("小驴子", 18, '女', "爱坤");
        GirlFriend1 g2 = new GirlFriend1("小木木", 26, '女', "打篮球");
        GirlFriend1 g3 = new GirlFriend1("小蛋蛋", 30, '女', "rapper");
        GirlFriend1 g4 = new GirlFriend1("静静", 20, '女', "唱歌");

        //将对象存储在数组当中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        //计算平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getAge();
        }
        int average = sum / arr.length; //平均年龄
        System.out.println("平均年龄是:" + average);
        System.out.println();

        //统计年龄比平均年龄低的有几个,并将其的全部数据输出
        int count = 0;    //年龄小的
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < average) {
                count++;
                arr[i].GirlfriendShowInfo();
                System.out.println();
            }
        }
        System.out.println("一共有"+count+"个女的比平均年龄低");


    }
}
