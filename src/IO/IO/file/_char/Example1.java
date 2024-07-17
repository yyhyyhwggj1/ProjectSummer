package IO.IO.file._char;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example1 {
    public static void main(String[] args) {
        String s="超用心在线教育";
        try(Writer p=new FileWriter("D:\\aa\\b\\cc.txt",true);)
        {
            File folder=new File("D:\\aa\\b\\cc.txt");
            File parent=folder.getParentFile();
            if(!parent.isAbsolute())
            {
                parent.mkdirs();
            }
            char[] chars=s.toCharArray();
            p.write(chars);
            for(char c: chars)
            {
                p.append(c);
            }
            p.write(s);
            p.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
