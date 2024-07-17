package Collection.Array.Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Comparator<Student> c=(o1,o2)->{
            int age1=o1.getAge();
            int age2=o2.getAge();
            if(age2>age1)
                return -1;
            if(age2==age1)
                return 0;
            return 1;
        };
        TreeMap<Student,Integer> map=new TreeMap<>(c);
        map.put(new Student("张三",18),1);
        map.put(new Student("李四",20),2);
        Set<Student> studentSet=map.keySet();
        for(Student stu:studentSet)
            System.out.println(stu);
    }
}
