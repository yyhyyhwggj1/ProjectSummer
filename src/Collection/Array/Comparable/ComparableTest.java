package Collection.Array.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        Student[] students={
                new Student("张三",21),
                new Student("李四",23),
                new Student("孙五",28),
                new Student("龙华",27)
        };
        Arrays.sort(students);
        for(Student stu: students)
            System.out.println(stu);
        System.out.println("==========");
        ArrayList<Student> students1=new ArrayList<>();
        students1.add(new Student("张三",21));
        students1.add(new Student("李四",23));
        students1.add(new Student("孙五",28));
        students1.add(new Student("龙华",27));
        Collections.sort(students1);
        for(Student stu1:students1)
            System.out.println(stu1);
        System.out.println("=======");
        String[] strings={"a","b","c","d","e"};
        Arrays.sort(strings);
        for(String str:strings)
            System.out.println(str);
    }
}
