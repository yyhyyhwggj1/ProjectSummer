package Experiment6;

public class Pet {
    public String name;
    public int health;
    public int love;
    public Pet(String name,int health,int love)
    {
        this.name=name;
        this.health=health;
        this.love=love;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLove(int love) {
        this.love = love;
    }
    public void print()
    {
        System.out.println(this.name+"\t"+this.health+"\t"+this.love);
    }
}
