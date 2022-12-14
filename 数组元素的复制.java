//把一个数组中的元素复制到另一个新的数组当中去
public class 数组元素的复制 {
    public static void main(String[] args) {
        //搞一个老数组
        int arr1[]={4,56,4,65,4,1231,145,65,465,4,65,13,1,56,4,98,74,89,798,43};
        //在搞一个和老数组个数一样的数组
        int arr2[]=new int[arr1.length];
        //再将老数组中的数依次存入新数组当中去
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        //打印老数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //打印新数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
