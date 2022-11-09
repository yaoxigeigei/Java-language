public class 数组中找最大数字 {
    public static void main(String[] args) {
        int arr[]={2,63,52,65,32,1,651,6,85,564,6};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
