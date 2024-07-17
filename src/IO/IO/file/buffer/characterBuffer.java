package IO.IO.file.buffer;

import java.io.*;

public class characterBuffer {
    public static void copyFile(String s1,String s2)
    {
        File  folder=new File(s2);
        File parent=folder.getParentFile();
        if(!parent.exists())parent.mkdirs();
        char[] buffer=new char[4096];
        try (Writer p = new FileWriter(s2);BufferedWriter writer=new BufferedWriter(p);
        Reader p1=new FileReader(s1);BufferedReader reader=new BufferedReader(p1))
        {
            while(true)
            {
                int len=reader.read(buffer);
                if(len==-1)break;
                writer.write(buffer,0,len);
            }
            writer.flush();
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
