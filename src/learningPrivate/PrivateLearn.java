package learningPrivate;

public class PrivateLearn {
    private static String name = "刘德华";
    private String sex;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public PrivateLearn(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void show() {
        System.out.println(name);
        System.out.println(sex);
        System.out.println(age);
    }
}
