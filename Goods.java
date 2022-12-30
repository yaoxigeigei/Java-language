public class Goods {

    //商品属性
    private String ID;
    private String name;
    private double price;
    private int  stock;

    //构造方法
    public Goods() {
    }

    public Goods(String ID, String name, double price, int stock) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * 设置
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }




}
