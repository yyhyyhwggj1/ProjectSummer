package Experiment6;

public class Teacher extends Certificate{

    public Teacher(int id, String name, String sex, String birthday) {
        super(id, name, sex, birthday);
    }
    public String duties;
    public String signTime;

    @Override
    public void print() {
        System.out.println(this.id+"\t"+this.name+"\t"+this.sex+"\t"+this.birthday+"\t"+this.duties+"\t"+"\t"+this.signTime);
    }
}
