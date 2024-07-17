package IO.IO.file._data;

import java.io.*;

public class Example {
    public static void write() {
        String path = "d:\\s\\tes.txt";
        File file = new File(path);
        File parent = file.getParentFile();
        if (!parent.exists()) parent.mkdirs();
        try (OutputStream p = new FileOutputStream(file);
             DataOutputStream p1 = new DataOutputStream(p)) {
            p1.writeByte(-1);
            p1.writeShort(-2);
            p1.writeInt(10);
            p1.writeLong(100);
            p1.writeFloat(10.0f);
            p1.writeDouble(100.0);
            p1.writeChar('a');
            p1.writeBoolean(true);
            p1.writeUTF("这是UTF-8编码下的字符！");
            p1.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String path = "d:\\s\\tes.txt";
        File file = new File(path);
        try(InputStream p=new FileInputStream(file);
          DataInputStream p1=new DataInputStream(p)) {
            short s=p1.readShort();
            System.out.println("读取短整数:"+s);
            byte b=p1.readByte();
            System.out.println("读取字节数："+b);
            int i=p1.readInt();
            System.out.println("读取整数："+i);
            long l= p1.readLong();
            System.out.println("读取长整数："+l);
            float f= p1.readFloat();
            System.out.println("读取单精度浮点数："+f);
            double d=p1.readDouble();
            System.out.println("读取双精度浮点数："+d);
            char c=p1.readChar();
            System.out.println("读取字符："+c);
            boolean bool=p1.readBoolean();
            System.out.println("读取布尔值："+bool);
            String stu=p1.readUTF();
            System.out.println("读取字符串："+stu);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (EOFException e)
        {
            e.printStackTrace();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

