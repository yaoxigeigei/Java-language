/*
创建一个数组 放入1 2 3 4 5
交换后数组的内容变为5 4 3 2 1
 */
public class 交换数组中的数据 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp = 0;
        for(int i=0 , j=arr.length-1 ; i < j; i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
