package Experiment6;

public class Student extends Certificate{

    public Student(int id, String name, String sex, String birthday) {
        super(id, name, sex, birthday);
    }
    public String system;
    public String schoolDate;

    @Override
    public void print() {
        System.out.println(this.id+"\t"+this.name+"\t"+this.sex+"\t"+this.birthday+"\t"+this.system+"\t"+this.schoolDate);
    }
}
