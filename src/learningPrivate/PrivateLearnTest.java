package learningPrivate;

public class PrivateLearnTest {
    public static void main(String[] args)
    {
        PrivateLearn s1 = new PrivateLearn( "男", 53);
        s1.setName("梁朝伟");
        s1.setAge(53);
        s1.show();
        PrivateLearn s2=new PrivateLearn("男",54);
        s2.show();
    }
}
