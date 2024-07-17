package StringLearning.Lesson2;

public class Example6 {
    public static void main(String[] args) {
        String s1="超用心";
        String s2="在线教育";
        String s3=s1+s2;
        String s5=s3.intern();
        String s4="超用心在线教育";
        System.out.println(s3==s4);
        System.out.println(s5==s4);
    }
}
