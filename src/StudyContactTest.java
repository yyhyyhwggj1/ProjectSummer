import java.util.Scanner;
public class StudyContactTest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入长度：");
        int length=sc.nextInt();
        StudyContact scs=new StudyContact();
        for(int i=0;i<length;++i)
        {
            System.out.println("请输入是s1：");
            String s1=sc.next();
            System.out.println("请输入s2：");
            double s2=sc.nextDouble();
            System.out.println("请输入s3：");
            int s3=sc.nextInt();
            scs.insert(new StudyBack(s1,s2,s3));
        }
        show(scs.contact);
    }
    public static void show(StudyBack[] s)
    {
        for(int i=0;i<s.length;++i)
        {
            System.out.println(s[i].s1);
            System.out.println(s[i].s2);
            System.out.println(s[i].s3);
        }
    }
}
