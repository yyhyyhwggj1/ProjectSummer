package LearningObject.Interface.Test;

public class Keyboard implements USB{
    @Override
    public void device() {
        System.out.println("键盘已接入");
    }
}
