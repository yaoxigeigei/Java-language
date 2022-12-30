public class GoodsTest {
    public static void main(String[] args) {
        //创建一个数组存储三个商品
        Goods arr[]=new Goods[3];

        //创建三个商品对象
        Goods g1 = new Goods("001","小米",4999,100);
        Goods g2 = new Goods("002","华为",9999,10000);
        Goods g3 = new Goods("003","枸杞",50,500);

        //将商品的信息存储到数组当中去
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;

        //将商品的信息打印出来
        for (int i = 0; i < 3; i++) {
            Goods goods =arr[i];
            System.out.println(goods.getID()+","+goods.getName()+","+
                    goods.getPrice()+","+goods.getStock());
        }


    }
}
