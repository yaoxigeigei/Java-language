public class 重载方法之判断数组最大值并返回 {
    public static void main(String[] args) {
        int arr[]={5,6,48,8,1,32,1,5,49,68};
        int max =getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
