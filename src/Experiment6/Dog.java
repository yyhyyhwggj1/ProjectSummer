package Experiment6;

public class Dog extends Pet{
    public Dog(String name, int health, int love) {
        super(name, health, love);
    }
    public String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public void print() {
        System.out.println(this.name+"\t"+this.health+"\t"+this.love+"\t"+this.strain);
    }
}
