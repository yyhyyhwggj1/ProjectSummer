package StringLearning.Lesson2;

public class Example2 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3="ABC";
        boolean judge=s1.equals(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
