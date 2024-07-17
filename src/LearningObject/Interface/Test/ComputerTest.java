package LearningObject.Interface.Test;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.insert(1,new Mouse());
        computer.insert(2,new Keyboard());
    }
}
