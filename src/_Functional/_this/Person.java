package _Functional._this;

public class Person {
    public void takePhotos(String name)
    {
        System.out.println("给"+name+"拍照！");
    }
    public void travel(String name)
    {
        Camera c=this::takePhotos;
        c.takePhotos(name);
    }
}
