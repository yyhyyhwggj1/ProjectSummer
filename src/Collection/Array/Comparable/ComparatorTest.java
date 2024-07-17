package Collection.Array.Comparable;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        Course[] courses={new Course("java",5),
                          new Course("HTML",3),
                           new Course("JAVAScript",2),new Course("JDBC",6)};
        Comparator<Course> courseList=(o1,o2)->{
            int score1=o1.getScore();
            int score2=o2.getScore();
            if(score2==score1)
                return o1.getName().compareTo(o2.getName());
            else if(o1.getScore()<o2.getScore())return -1;
            else return 1;
        };
        Arrays.sort(courses,courseList);
        for(Course c:courses)
            System.out.println(c);
        System.out.println("=======");
        List<Course> courseList1=new ArrayList<>();
        courseList1.add(new Course("java",5));
        courseList1.add(new Course("HTML",3));
        courseList1.add(new Course("JAVAScript",2));
        courseList1.add(new Course("JDBC",6));
        Collections.sort(courseList1,courseList);
        for(Course course:courseList1)
            System.out.println(course);
    }
}
