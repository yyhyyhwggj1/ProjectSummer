package Collection.Array;

public class Student {
    private String name;
    private String sex;
    private  int age;
    private  double score;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getScore() {
        return score;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public Student(String name,String sex,int age,double score)
    {
        this.age=age;
        this.name=name;
        this.score=score;
        this.sex=sex;
    }

    @Override
    public String toString() {
        return name+","+sex+","+age+","+score;
    }
}
