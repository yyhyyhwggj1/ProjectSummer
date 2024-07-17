package Collection.Array.Map;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(String name,int age)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "{"+name+","+age+"}";
    }
}
