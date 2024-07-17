package IO.IO.file._byte;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example4 {
    public static void main(String[] args) throws IOException {
        File file=new File("D://aa");
        if(!file.exists())
        {
            file.mkdirs();
        }
        File folder=new File(file,"c.txt");
        OutputStream p=new FileOutputStream(folder,true);
        String s="超用心在线教育";
        byte[] bytes=s.getBytes();
//
        p.write(bytes,3, bytes.length-3);
        p.flush();
        p.close();

    }
}
