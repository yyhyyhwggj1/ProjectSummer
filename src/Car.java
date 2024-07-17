public class Car {
    public String brand;
    public String type;
    public double price;
    public Car()
    {
        this.brand="默认品牌";
        this.type="默认型号";
        this.price=100000;
    }
    public void show ()
    {
        System.out.println(this.brand+"\t"+this.type+"\t"+this.price);
    }
}
