package Experiment6;

public class Penguin extends Pet{
    public Penguin(String name, int health, int love) {
        super(name, health, love);
    }
    public String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void print()
    {
        System.out.println(this.name+"\t"+this.health+"\t"+this.love+"\t"+this.sex);
    }
}
