package Collection.Array.Comparable;

public class Course {
    private String name;
    private int score;
    public Course(String name,int score)
    {
        this.score=score;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Course"+"{"+name+" "+score+"}";
    }
}
