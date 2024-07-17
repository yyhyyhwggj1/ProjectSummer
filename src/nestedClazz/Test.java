package nestedClazz;

public class Test {
    public static void main(String[] args) {
        Car c=new Car("奥托",150000);
        c.show();
        Car.Engine c1=new Car("奥托",150000).new Engine(150000,"进口");
        Car c2=new Car(c1,"宝马",200000);
        c2.show();
    }
}
