package IO.IO.file._char;

import java.io.*;

public class Example3 {
    public static void copyFile(String s1,String s2)
    {
        File folder=new File(s2);
        File parent=folder.getParentFile();
        if(!parent.exists())parent.mkdirs();
        char[] buffer=new char[4096];
        try(Reader p1=new FileReader(s1); Writer p2=new FileWriter(s2)) {
            while(true)
            {
                int len=p1.read(buffer);
                if(len==-1)
                    break;
                p2.write(buffer,0,len);
            }
            p2.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String s1="D:\\aa\\b\\c\\Head First Java.第二版.中文完整高清版.pdf";
        String s2="D:\\bb\\cc\\java.pdf";
        copyFile(s1,s2);
    }
}
