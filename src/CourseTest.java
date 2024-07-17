import java.util.Scanner;
public class CourseTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Course[] school=new Course[5];
        for(int i=0;i<5;++i)
        {
            System.out.println("请输入课程编号：");
            String CourseNum=sc.next();
            System.out.println("请输入课程名称：");
            String name=sc.next();
            System.out.println("请输入课程学分：");
            int score=sc.nextInt();
            school[i]=new Course(CourseNum,name,score);
        }
    }
}
