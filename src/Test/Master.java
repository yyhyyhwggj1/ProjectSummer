package Test;

public class Master {
    String nameString;
    int id;
    int age;
    public String getNameString() {
        return nameString;
    }
    public void setNameString(String nameString) {
        this.nameString = nameString;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Master [nameString=" + nameString + ", id=" + id + ", age="
                + age + "]";
    }
    public Master(String nameString, int id, int age) {
        super();
        this.nameString = nameString;
        this.id = id;
        this.age = age;
    }
}
