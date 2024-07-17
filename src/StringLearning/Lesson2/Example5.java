package StringLearning.Lesson2;

public class Example5 {
    public static void main(String[] args) {
        String s1="MY";
        String s2="WORLD";
        String s3=s1+s2;
        String s4=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s4);
        String s5="  abc de  ";
        String s6=s5.trim();
        System.out.println(s6);
        String s7="aA1b2c3d4e5";
        String[] s8=s7.split("[0-9]");
        for(int i=0;i<s8.length;++i)
            System.out.println(s8[i]);
        String s9="刘德华,53,很帅气";
        String[] s10=s9.split(",");
        for(int i=0;i<s10.length;++i)
        {
            System.out.println(s10[i]);
        }
        String regex="[a-z0-9A-Z]+";
        boolean judge=s7.matches(regex);
        System.out.println(judge);
    }
}
