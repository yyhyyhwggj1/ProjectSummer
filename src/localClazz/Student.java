package localClazz;

public class Student {
    private int age;
    private String name;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void show()
    {
        System.out.println(name+"\t"+age);
    }

    public int getAge() {
        return age;
    }
}
