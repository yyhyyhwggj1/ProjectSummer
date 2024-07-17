package Experiment6;

public class Person {
    public String name;
    public int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public Person()
    {}
    public void showInfo()
    {
        System.out.println(this.name+"\t"+this.age);
    }
}
