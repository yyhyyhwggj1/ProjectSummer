package Polymorphism.Lesson3;

public class DeviceTest {
    public static void main(String[] args) {
        Quality p1=new Quality();
        p1.check(new AirConditioning());
        p1.check(new TV());
        p1.check(new ElectronicFan());
    }
}
