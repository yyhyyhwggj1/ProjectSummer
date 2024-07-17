package IO.IO.file.buffer;

import java.io.*;

public class byteBuffer {
    public static void main(String[] args) {
        String s1="D:\\aa\\b\\c\\Head First Java.第二版.中文完整高清版.pdf";
        String s2="D:\\bb\\cc\\java.pdf";
        copyFile(s1,s2);
    }
    public static void copyFile(String s1,String s2)
    {
        File folder=new File(s2);
        File parent=folder.getParentFile();
        if(!parent.exists())parent.mkdirs();
        byte[] buffer=new byte[4096];
        try(InputStream read=new FileInputStream(s1);
            BufferedInputStream p=new BufferedInputStream(read);
            OutputStream write=new FileOutputStream(s2);
            BufferedOutputStream p1=new BufferedOutputStream(write)
           ) {
            while(true) {
                int len = p.read(buffer);
                if (len == -1)
                    break;
                p1.write(buffer,0,len);
            }
            p1.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
