package RefrenceMethod.MemberMethod.This;

public class Person {
    public void takePhotos(String name)
    {
        System.out.println("给"+name+"拍照");
    }
    public void travel(String str)
    {
        Camera camera=this::takePhotos;
        camera.takePhotos(str);
    }
}
