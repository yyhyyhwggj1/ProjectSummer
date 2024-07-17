package Polymorphism.Lesson3;

public class ElectronicFan extends Device{
    @Override
    public void show() {
        System.out.println("这是一个高级的电风扇");
    }
    public void start()
    {
        System.out.println("电风扇启动");
    }
}
