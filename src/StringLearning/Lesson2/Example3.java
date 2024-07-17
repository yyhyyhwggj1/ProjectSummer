package StringLearning.Lesson2;

import java.util.Locale;

public class Example3 {
    public static void main(String[] args) {
        String s1="abandon";
        String s2="ABC";
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s2.toLowerCase(Locale.ROOT));
        System.out.println(s1.charAt(0));
        int index1=s1.indexOf('b');
        System.out.println(index1);
        System.out.println(s1.length()+"\t"+s2.length());
        int index2=s1.indexOf('a');
        int index3=s1.lastIndexOf('a');
        System.out.println(index2+"\t"+index3);
        String s3="Hello World";
        String s4=s3.replace('o','a');
        System.out.println(s4);
        String s5="a1b2c3d4e5f6";
        String s6=s5.replaceAll("[0-9]","");
        System.out.println(s6);
        String s7=s5.replaceAll("[a-z]","");
        System.out.println(s7);

    }
}
