package IO.IO.file._byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example5 {
    public static void main(String[] args) {
        try {
            InputStream is= new FileInputStream("D:\\aa\\b\\c.txt");
//            int length=is.available();
//            byte[] bytes=new byte[length];
//            int index=0;
//            while(true)
//            {
//                byte b= (byte) is.read();
//                if(b==-1)
//                {
//                    break;
//                }
//                bytes[index++]=b;
//            }
//            System.out.println(new String(bytes));
            byte[] buffer=new byte[20];
            while(true)
            {
                int len=is.read(buffer);
                if(len==-1)
                    break;
                System.out.println(len);
                System.out.println(new String(buffer));
            }
            is.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
