package Polymorphism.Lesson3;

public  class AirConditioning extends Device{

    @Override
    public void show() {
        System.out.println("这是格力空调");
    }
    public void AirColder()
    {
        System.out.println("空调制冷");
    }
}
