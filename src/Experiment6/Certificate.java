package Experiment6;

public class Certificate {
    public int id;
    public String name;
    public String sex;
    public String birthday;
    public Certificate(int id,String name,String sex,String birthday)
    {
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
    }
    public void print()
    {
        System.out.println(this.id+"\t"+this.name+"\t"+this.sex+"\t"+this.birthday);
    }
}
