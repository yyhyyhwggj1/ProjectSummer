package nestedClazz;

public class Test1 {
    public static void main(String[] args) {
        StudentManager p=new StudentManager();
        p.addStudent(new Student("张三",20));
        p.addStudent(new Student("李四",21));
        p.addStudent(new Student("孙武",22));
        p.addStudent(new Student("赵六",23));
        p.show(new StudentManager.studentSorter(1));
    }
}
