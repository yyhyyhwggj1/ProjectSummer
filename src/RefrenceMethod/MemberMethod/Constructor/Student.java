package RefrenceMethod.MemberMethod.Constructor;

public class Student {
    public String name;
    public String sex;
    public Student(String name,String sex)
    {
        this.name=name;
        this.sex=sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
