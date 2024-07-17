public class StudentTest {
    public static void main(String[] args) {
        System.out.println("这是最后一行代码");
        Student s1=new Student("张三",20);
        Student s2=new Student("张三",20);
        System.out.println(s1.hashCode()+"\t"+s2.hashCode()+"\t"+s1.equals(s2));
        show();
    }
    public static void show ()
    {
        Student s2=new Student("张三",20);
        System.out.println(s2);
    }
}
