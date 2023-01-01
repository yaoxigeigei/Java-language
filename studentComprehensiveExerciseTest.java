import java.util.Scanner;

public class studentComprehensiveExerciseTest {
    public static void main(String[] args) {
        //引入函数
        Scanner sc = new Scanner(System.in);

        //创建一个数组来存储对象
        studentComprehensiveExercise arr[] = new studentComprehensiveExercise[3];
        //创建学生对象
        studentComprehensiveExercise stu1 = new studentComprehensiveExercise(1, "张三", 19);
        studentComprehensiveExercise stu2 = new studentComprehensiveExercise(2, "李四", 28);
        studentComprehensiveExercise stu3 = new studentComprehensiveExercise(3, "小飞", 26);
        //将学生对象存入到数组当中去
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1: 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //已存在-不用添加
        //不存在-扩展在添加
        studentComprehensiveExercise stu4 = new studentComprehensiveExercise(4, "赵六", 29);
        //进行唯一性判断
        boolean flag = contains(arr, stu4.getId());
        //对返回来的结果做出不同的做法
        if (flag) {
            //已存在-不用添加
            System.out.println("当前学生ID已经存在,请修改ID后添加");
        } else {
            //不存在--把学生信息存储到数组当中
            //将stu4存入
            //1:数组满了-创建新的数组
            //2:数组没满-直接存入数据
            int count = getCount(arr);
            if (count == arr.length) {
                //已经存满
                //创建新的数组
                studentComprehensiveExercise newArr[] = creatNewArr(arr);
                //将stu4存入
                newArr[count] = stu4;
                //要求2: 添加完毕之后，遍历所有学生信息。
                arr=newArr;
                showArrInfo(newArr);
            } else {
                //没有存满
                arr[count] = stu4;
                //要求2: 添加完毕之后，遍历所有学生信息。
                showArrInfo(arr);
            }

        }

        //要求3: 通过id删除学生信息
        //1:存在-删除   不存在-提示没有这个学生
        //找到该id在数组中的位置
        System.out.print("输入你要删除的id:");
        int id = sc.nextInt();
        int index = getIndex(arr, id);
        if (index >= 0) {
            //该id在数组中存在的时候  删除对应索引的数组
            arr[index] = null;
            showArrInfo(arr);
        } else {
            //该id在数组中不存在的时候
            System.out.println("你要删除的学生id不存在,请检查后输入");
            showArrInfo(arr);
        }

        //要求5: 查询数组id为“××”的学生，如果存在，则将他的年龄+1岁*/
        //存在的话就加一 不存在的话就输出没有该学生
        System.out.print("请问你将谁的年龄加一:");
        int a =sc.nextInt();
        int index1 = getIndex(arr,a);
        if(index1>=0){
            //存在
            arr[index1].setAge(arr[index1].getAge()+1);
            //遍历数组
            showArrInfo(arr);
        }else {
            //不存在
            System.out.println("此id不存在,修改失败");
        }


    }

    //找到id索引并返回 有的话-返回  无-返回-1
    public static int getIndex(studentComprehensiveExercise arr[], int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getId() == id) {
                return i;
            }
        }
        //当循环结束后没有找到则返回一个-1
        return -1;
    }


    //遍历数组信息
    public static void showArrInfo(studentComprehensiveExercise arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("学号:" + arr[i].getId() + "姓名:" + arr[i].getName() + "年龄:" + arr[i].getAge());
            }
        }
    }


    public static studentComprehensiveExercise[] creatNewArr(studentComprehensiveExercise arr[]) {
        //创建新的数组 长度为旧数组长度加一
        studentComprehensiveExercise newArr[] = new studentComprehensiveExercise[getCount(arr) + 1];
        //将老数组中的元素添加的新数组当中去
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //判断数组中已经存在了几个元素
    public static int getCount(studentComprehensiveExercise arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
        //循环结束后就知道数组中有几个元素了
    }


    //判断当前数组中是否存在要添加的学生信息
    public static boolean contains(studentComprehensiveExercise arr[], int id) {
        //依次从数组当中获得学生得id
        for (int i = 0; i < arr.length; i++) {
            //判断学生id是否存在
            if (arr[i] != null && arr[i].getId() == id) {
                return true;
            }
        }
        //当循环结束后还没有找到一样的,那么就表示数组中要查找的id不存在
        return false;
    }
}
