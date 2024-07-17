package Polymorphism.Lesson3;

public class Quality {
    public void check(Device device)
    {
        device.show();
        if(device instanceof TV)
            ((TV)device).playVideo();
        else if(device instanceof ElectronicFan)
            ((ElectronicFan)device).start();
        else if(device instanceof AirConditioning)
            ((AirConditioning)device).AirColder();
    }
}
