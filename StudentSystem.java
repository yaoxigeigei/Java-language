import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        //创建集合
        ArrayList<StudentSystemClass> list= new ArrayList<>();
        loop: while (true) {
            System.out.println("---------欢迎来到学生管理系统---------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.print("请输入你的选择: ");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> modifyStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;   //跳出loop循环
                    //System.exit(0); //停止虚拟机运行
                }
                default -> System.out.println("没有此选项");
            }
        }



    }

    //添加学生
    public static void addStudent(ArrayList<StudentSystemClass> list){
        Scanner sc = new Scanner(System.in);

        //键盘录入数据
        System.out.print("输入学生id:");
        String id = sc.next();
        //判断id是否唯一
        boolean flag = contain(id,list);
        if(flag){
            System.out.println("id已经存在,请重新录入学生信息");
            return;
        }

        System.out.print("输入学生姓名:");
        String name = sc.next();

        System.out.print("输入学生年龄:");
        int age = sc.nextInt();

        System.out.print("输入学生家庭住址:");
        String address = sc.next();

        //创建学生对象
        StudentSystemClass stu = new StudentSystemClass(id,name,age,address);
        list.add(stu);
        System.out.println("添加成功");

    }

    //删除学生
    public static void deleteStudent(ArrayList<StudentSystemClass> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要删除学生的id:");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                list.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("id不存在,删除错误");
    }

    //修改学生
    public static void modifyStudent(ArrayList<StudentSystemClass> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("输入你要修改学生的id:");
        String oldid = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(oldid)){
                list.remove(i);
                //键盘录入数据
                System.out.print("输入学生id:");
                String newid = sc.next();

                System.out.print("输入学生姓名:");
                String name = sc.next();

                System.out.print("输入学生年龄:");
                int age = sc.nextInt();

                System.out.print("输入学生家庭住址:");
                String address = sc.next();

                list.add(i,new StudentSystemClass(newid,name,age,address));
                break;
            }else{
                System.out.println("没有此学生");
            }
        }

    }

    //查询学生
    public static void queryStudent(ArrayList<StudentSystemClass> list){
        //无数据
        if (list.size() == 0) {
            System.out.println("当前无学生信息");
            return;
        }else {
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                StudentSystemClass stu = list.get(i);
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
            }
        }
    }

    //判断id在集合当中是否唯一
    public static boolean contain(String id,ArrayList<StudentSystemClass> list){
        //遍历所有学生id 查找是否存在
        for (int i = 0; i < list.size(); i++) {
            //存在
            if (list.get(i).getId().equals(id)){
                return true;
            }
        }
        //不存在
        return false;
    }



}
