package StringLearning.Lesson2;

import java.nio.charset.Charset;

public class Lesson2 {
    public static void main(String[] args) {
        char[] values={'a','d','m','i','n'};
        byte[] values1={97,98,99,100,101,102};
        String s=new String(values,1,3);
        String s1=new String(values1,2,3);
        System.out.println(s);
        String s2="abcdef";
        System.out.println(s1);
        String s3=new String("abcdef");
        System.out.println(s2);
        System.out.println(s3);
        Charset charset=Charset.forName("UTF-8");
        String s4=new String(values1,charset);
        System.out.println(s4);
    }
}
