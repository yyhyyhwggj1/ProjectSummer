package Collection.Array.Comparable;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    private  String name;
    private  int age;
    public Student(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    @Override
    public int compareTo(@NotNull Student o) {
       if(age==o.age)
       {
           return name.compareTo(o.name);
       }
       else if (age>o.age)
           return 1;
       else return-1;
    }

    @Override
    public String toString() {
        return "{"+name+" "+age+"}";
        }
}
