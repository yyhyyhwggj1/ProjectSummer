package nestedClazz;

public class Car {
    private double price;
    private String brand;
    private Engine engine;
    public Car(String brand,double price)
    {
        this.brand=brand;
        this.engine=new Engine(50000,"国产");
        this.price=price+engine.price;
    }
    public Car(Engine engine,String brand,double price)
    {
        this.engine=engine;
        this.brand=brand;
        this.price=price+ engine.price;
    }
    public Car(){}

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
    public void show()
    {
        engine.show();
    }
    class Engine{

        private String type;
        private double price;
        public Engine(double price,String type)
        {
            this.price=price;
            this.type=type;
        }
        public void show()
        {
            System.out.println(brand+"：汽车使用的是"+type+"发动机价格为："+price);
            System.out.println("汽车的总价为："+Car.this.price);
        }
    }
}
