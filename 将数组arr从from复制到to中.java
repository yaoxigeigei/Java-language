public class 将数组arr从from复制到to中 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        copy(arr,3,7);
    }

    public static void copy(int arr[],int from,int to) {
        //先确定数组多大
        int newArr[]=new int[to-from];
        //
        int i=0;
        for (int a=from-1;a<to-1;a++){
            newArr[i]=arr[a];
            i++;
        }
        for (int j = 0; j < to-from; j++) {
            System.out.print(newArr[j]+" ");
        }
    }
}
