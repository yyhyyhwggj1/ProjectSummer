package Polymorphism.Lesson3;

public class TV extends Device{
    @Override
    public void show() {
        System.out.println("这是长虹电视机");
    }
    public void playVideo()
    {
        System.out.println("播放视频");
    }
}
