package Experiment6;

public class Pupil extends Person {
    public String sex;
    public Pupil(String name,int age,String sex)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public Pupil()
    {}
    public void showInfo()
    {
        System.out.println(this.name+"\t"+this.age+"\t"+this.sex);
    }

}
