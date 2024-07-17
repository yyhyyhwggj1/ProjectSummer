package IO.IO.file;

import java.io.File;

public class file {
    public static void main(String[] args) {
        File p1=new File("D:\\a\\b\\c.txt");
        File p2=new File("D:\\a\\b","c.txt");
        File parent=new File("c.txt");
        File p3=new File(parent,"c.txt");
        String s=p1.getAbsolutePath();
        System.out.println(s);
        String s1= parent.getAbsolutePath();
        System.out.println(s1);
        System.out.println(parent.getPath());
        String name=p1.getName();
        System.out.println(name);
        Long len=p1.getAbsoluteFile().length();
        System.out.println(len);
        Long lastUpdate=p1.lastModified();
        System.out.println(lastUpdate);
        Long current=System.currentTimeMillis();
        System.out.println(current);
    }
}
