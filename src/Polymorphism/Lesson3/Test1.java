package Polymorphism.Lesson3;

public class Test1 {
    public static void main(String[] args) {
        Device tv1=new TV();
       Class tv1Class=tv1.getClass();
       String name=tv1Class.getName();
       String simplyName= tv1Class.getSimpleName();
        System.out.println(name+"\t"+simplyName);

    }
}
