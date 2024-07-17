package LearningObject.Interface.Test;

public interface InterfaceTest {
    public static final int num=10;
    default void show()
    {
        System.out.println("欢迎进入接口世界！");
    }
    static void welcome()
    {
        System.out.println("欢迎您的到来！");
    }

    public static void main(String[] args) {
        welcome();
    }
}
