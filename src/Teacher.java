import java.util.Arrays;

public class Teacher {
    public Student[] stu = {};

    public void AddStu(Student stu) {
        this.stu = Arrays.copyOf(this.stu, this.stu.length + 1);
    }
}
