package LearningObject.Interface.Test;

public class Computer {
    USB[] USB=new USB[4];
    public void insert(int index,USB usb)
    {
        if(index> USB.length||index<0)
        {
            System.out.println("不要瞎搞！");
        }
        else {
            USB[index] = usb;
            USB[index].device();
        }
    }
}
