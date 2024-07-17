package IO.IO.file._char;

import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example2 {
    public static void main(String[] args) {
        char[] chars = new char[4096];
        try (Reader p = new FileReader("D:\\aa\\b\\cc.txt")) {
//            int offset=0;
//            while(true)
//            {
//                int len=p.read(chars,offset,30);
//                if(len==-1)break;
//                offset+=len;
//            }
            StringBuilder builder=new StringBuilder();
            while(true)
            {
                int b=p.read();
                if(b==-1)break;
                builder.append((char)b);
            }
            System.out.println(builder);
//            System.out.println(new String(chars,0,offset));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
