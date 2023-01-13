//定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回调用该方法，并在控制台输出结果。例如:
//数组为int arr={1,2,3);
//执行方法后的输出结果为:[1,2,3]

public class stringTest04 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,4,65,6,5445,6,656,65};
        String result = arrToString(arr);
        System.out.println(result);

    }

    public static String arrToString(int arr[]) {

        //空数组
        if(arr==null){
            return "";
        }

        //长度为0的数组
        if(arr.length==0){
            return "[]";
        }

        //主要代码
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
                result = result + arr[i]+"]";
            }else {
                result = result + arr[i] + ",";
            }

        }
        return result;
    }

}
