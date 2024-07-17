package IO.IO.file;

import java.io.File;
import java.io.IOException;

public class ExampLe1 {
    public static void main(String[] args) {
        File file=new File("D:\\Test\\stu\\abc.txt");
        boolean read=file.canRead();
        System.out.println(read);
        boolean write=file.canWrite();
        System.out.println(write);
        boolean exist= file.exists();
        System.out.println(exist);
        boolean direct=file.isDirectory();
        System.out.println(direct);
        boolean judge=file.isFile();
        System.out.println(judge);
        boolean hidden=file.isHidden();
        System.out.println(hidden);
        boolean execute=file.canExecute();
        System.out.println(execute);
        File newfile=new File("D:\\stu\\s1\\test.txt");
        File parentNewFile=newfile.getParentFile();
        if(!parentNewFile.exists())
        {
            parentNewFile.mkdirs();
        }
        if(!newfile.exists())
        {
            try
            {
                boolean success=newfile.createNewFile();
                System.out.println("文件创建成功："+success);
            }
            catch(IOException o)
            {
                o.printStackTrace();
            }
        }
        boolean delete=newfile.delete();
        System.out.println("文件删除成功："+delete);
        boolean deleteParent=parentNewFile.delete();
        System.out.println("文件夹删除成功："+deleteParent);
       boolean delete2=newfile.getParentFile().getParentFile().delete();
        System.out.println("文件夹删除成功："+delete2);
        File reName=new File("D:\\st\\s1\\test.txt");
        boolean renameSuccess=file.renameTo(reName);
        System.out.println(renameSuccess);

    }
}
