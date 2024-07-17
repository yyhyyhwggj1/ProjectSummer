package StringLearning.Lesson2;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Example4 {
    public static void main(String[] args) {
        String s="My god";
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;++i)
        {
            System.out.println(arr[i]);
        }
        byte[] bytes=s.getBytes(StandardCharsets.UTF_8);
        for(int i=0;i< bytes.length;++i)
        {
            System.out.println(bytes[i]);
        }
        byte[] bytes1=s.getBytes(Charset.forName("GB2312"));
        for(int i=0;i< bytes1.length;++i)
        {
            System.out.println(bytes1[i]);
        }
    }
}
