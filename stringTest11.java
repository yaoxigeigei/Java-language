/*
     需求:定义一个方法，把int 数组中的数据按照指定的格式拼接成一个字符串返回调用该方法，并在控制台输出结果
     例如:数组为intIl arr =[1,2,3};执行方法后的输出结果为:[1,2,3]
*/
public class stringTest11 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(intArrToString(arr));

    }

    public static String intArrToString(int arr[]){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i!=arr.length-1){
                sb.append(",");
            }
        }
        return sb.append("]").toString();
    }
}
