public class Car {
    //属性
    private String brand;
    private double price;
    private String colour;

    //构造方法
    public Car() {
    }

    public Car(String brand, double price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

    //set和get
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


}
