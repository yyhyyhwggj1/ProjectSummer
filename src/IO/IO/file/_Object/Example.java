package IO.IO.file._Object;

import java.io.*;

public class Example {
    public static void main(String[] args) {
       String path="d:\\aaa\\bb\\oop.obj";
        File file=new File(path);
        try(InputStream p=new FileInputStream(file);
          ObjectInput ois=new ObjectInputStream(p);) {
         People s=(People)ois.readObject();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static void writeObj()
    {
        String path="d:\\aaa\\bb\\oop.obj";
        File file=new File(path);
        File parent=file.getParentFile();
        if(!parent.exists())parent.mkdirs();
        try(OutputStream p=new FileOutputStream(file);
            ObjectOutput oop=new ObjectOutputStream(p);) {
            oop.writeObject(new People("张三","男"));
            oop.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

