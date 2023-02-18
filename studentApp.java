import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class studentApp {
    //主体
    public static void main(String[] args) {
        ArrayList<studentAppClass> list = new ArrayList<>();

        loop1:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作: 1:登录 2:注册 3:忘记密码 4:遍历所有信息 5:退出系统");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> printList(list);
                case "5" -> {
                    break loop1;
                    //System.exit(0);  停止虚拟机运行
                }
                default -> System.out.println("输入错误,请重新输入");
            }
        }
    }

    //注册
    private static void register(ArrayList<studentAppClass> list) {
        //创建一个新集合
        Scanner sc = new Scanner(System.in);
        studentAppClass stu = new studentAppClass();
        //1:验证用户名字
        while (true) {
            System.out.print("请输入用户名:");
            String username = sc.next();
            //用户长度必须在3-15位之间
            //只能是字母加数字,但不能是纯数字
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("用户名格式不满足,请重新输入");
                continue;
            }
            //判断用户名是否唯一
            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("用户名存在,请重新输入");
                continue;
            } else {
                //用户名不存在,添加数据到集合当中
                stu.setUsername(username);
                break;
            }
        }
        //2:验证密码
        while (true) {
            System.out.print("请输入密码:");
            String password1 = sc.next();
            System.out.print("请再一次输入你的密码:");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                //两个输入一致,添加密码
                System.out.println("密码注册正确");
                stu.setPassword(password1);
                break;
            } else {
                //输入不一致,重新输入
                System.out.println("两次密码输入不一致,请重新输入");
                continue;
            }
        }
        //3:验证身份证号码
        while (true) {
            System.out.print("请输入身份证号码:");
            String personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag) {
                System.out.println("身份证号正确");
                stu.setPersonID(personID);
                break;
            } else {
                System.out.println("身份证号格式错误,请重新输入");
                continue;
            }
        }
        //4:手机号验证
        while (true) {
            System.out.print("请输入你的手机号:");
            String phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号输入正确");
                stu.setPhoneNumber(phoneNumber);
                break;
            } else {
                System.out.println("手机号输入错误,请重新输入");
                continue;
            }
        }
        //将数据存入到集合当中
        list.add(stu);
        System.out.println("注册成功");

    }

    //遍历集合内的所有信息
    private static void printList(ArrayList<studentAppClass> list) {
        if (list.size() == 0) {
            System.out.println("数据库内没有信息,请录入后再查找");
        }else{
            for (int i = 0; i < list.size(); i++) {
                studentAppClass stu = list.get(i);
                System.out.println(stu.getUsername() + "," + stu.getPassword() + "," + stu.getPersonID() + "," + stu.getPhoneNumber());
            }
        }
    }

    //登录
    private static void login(ArrayList<studentAppClass> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请先输入你的用户名:");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (flag) {
            //用户名存在,返回索引
            int index = getIndex(list, username);
            while (true) {
                //判断验证码是否正确
                //1:先生成验证码
                String code = createCode();
                //2:再判断是否正确
                System.out.println(code);
                System.out.print("请输入验证码:");
                String inputCode = sc.next();
                if (!(code.equals(inputCode))) {
                    System.out.println("验证码输入错误,请重新输入");
                } else {
                    System.out.println("验证码输入正确");
                    break;
                }
            }
            //判断密码是否正确
            loop:
            while (true) {
                for (int i = 0; i < 3; i++) {
                    System.out.print("请输入你的密码:");
                    String password = sc.next();
                    if(i==0){
                        if (password.equals(list.get(index).getPassword())) {
                            System.out.println("密码正确,登录成功");
                            break loop;
                        } else {
                            System.out.println("密码错误,请重新输入");
                            continue;
                        }
                    }else {
                        System.out.println("还有"+i+"次机会");
                        if (password.equals(list.get(index).getPassword())) {
                            System.out.println("密码正确,登录成功");
                            break loop;
                        } else {
                            System.out.println("密码错误,请重新输入");
                            continue;
                        }
                    }

                }
                System.out.println("账号锁定,请联系客服处理");
                break loop;
            }
        } else {
            //用户名不存在
            System.out.println("用户名字不存在,请先注册再登录");
        }

    }

    //生成验证码
    private static String createCode() {
        //创建一个集合,将所有的大小写字母放入
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        //抽取4个字母
        Random rdm = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随即索引
            int index = rdm.nextInt(list.size());
            char c = list.get(index);
            //将随机字母放入
            sb.append(c);
        }
        //生成一个随机数字
        int randomNumber = rdm.nextInt(10);
        //将随机数字加入到StringBuilder中
        sb.append(randomNumber);
        //将StringBuilder中的顺序打乱
        //1:将StringBuilder先变成字符串然后再变成字符数组
        char arr[] = sb.toString().toCharArray();
        //2:把最后一个数字与前面的一个随机换位置
        int randomIndex = rdm.nextInt(5);
        char temp = ' ';
        temp = arr[4];
        arr[4] = arr[randomIndex];
        arr[randomIndex] = temp;
        //返回验证码
        return new String(arr);
    }

    //返回存在用户名的索引
    private static int getIndex(ArrayList<studentAppClass> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getUsername();
            if (username.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //手机号验证
    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //不能以0开头
        if (phoneNumber.charAt(0) == '0') {
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //验证身份证号码
    private static boolean checkPersonID(String personID) {
        //长度为18
        if (personID.length() != 18) {
            return false;
        }
        //不能以0开头
        if (personID.charAt(0) == '0') {
            return false;
        }
        //前17位都是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //最后一位可以是数字,也可以是x/X
        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || endChar == 'x' || endChar == 'X') {
            return true;
        } else {
            return false;
        }
    }

    //判断集合当中是否存在该用户名
    private static boolean contains(ArrayList<studentAppClass> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getUsername();
            if (name.equals(username)) {
                return true;
            }
        }
        //集合里面都比较完毕了 则返回false
        return false;
    }

    //判断用户名是否合法
    private static boolean checkUsername(String username) {
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //运行到这里表示用户名的长度符合要求
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= '0' || c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                return false;
            }
        }
        //运行到这里表示是字母加数字
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                count++;
                break;
            }
        }
        //运行到这里表示不仅仅是数字
        return count > 0;
    }

    //忘记密码
    private static void forgetPassword(ArrayList<studentAppClass> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请先输入你的用户名");
        String username = sc.next();
        boolean flag = contains(list,username);
        if (flag) {
            //有此用户名
            //1:返回此用户名的索引
            int index = getIndex(list,username);
            //2:判断身份证号和手机号码是否正确
            while (true) {
                System.out.print("输入身份证号:");
                String personID = sc.next();
                System.out.print("输入手机号码:");
                String phoneNumber = sc.next();
                //该用户的值
                studentAppClass user = list.get(index);
                if (user.getPersonID().equalsIgnoreCase(personID) && user.getPhoneNumber().equals(phoneNumber)) {
                    System.out.print("输入正确,修改密码:");
                    String newpassword = sc.next();
                    user.setPassword(newpassword);
                    System.out.println("修改成功");
                    break;
                }else{
                    System.out.println("输入错误,请重新输入");
                    continue;
                }
            }
        }else {
            //该用户名不存在
            System.out.println("没有此用户名,请先注册后使用");
        }
    }


}
