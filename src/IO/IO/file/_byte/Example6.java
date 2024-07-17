package IO.IO.file._byte;

import java.io.*;

public class Example6 {
    public static void main(String[] args) {
        String s1="D:\\Java class\\Java学习路线配套书籍\\第2-3阶段\\Head First Java.第二版.中文完整高清版.pdf";
        String s2="D:\\aa\\b\\c\\tes.pdf";
        copyFile(s1,s2);
    }
    public static void copyFile(String s1,String s2)
    {
        try (InputStream p=new FileInputStream(s1);
             OutputStream p1=new FileOutputStream(s2);){
            File fol=new File(s2);
            File parent=fol.getParentFile();
            if(!parent.exists())
            {
                parent.mkdirs();
            }
            byte[] buffer=new byte[4096];
            while(true)
            {
                int len=p.read(buffer);
                System.out.println(len);
                if(len==-1)break;
                p1.write(buffer,0,len);
            }
            p1.flush();
            p1.close();
            p.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void copyFile2(String s1,String s2)
    {
        InputStream p=null;
        OutputStream p1=null;
        try {
            File fol=new File(s2);
            File parent=fol.getParentFile();
            p=new FileInputStream(s1);
            p1=new FileOutputStream(s2);
            if(!parent.exists())
            {
                parent.mkdirs();
            }
            byte[] buffer=new byte[4096];
            while(true)
            {
                int len=p.read(buffer);
                System.out.println(len);
                if(len==-1)break;
                p1.write(buffer,0,len);
            }
            p1.flush();
            p1.close();
            p.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            cloth(p,p1);
        }
    }
    public static void cloth(Closeable...closeables)
    {
        for(Closeable cloth: closeables)
        {
            if(cloth!=null)
            {
                try{
                    cloth.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
