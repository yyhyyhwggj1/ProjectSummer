package IO.IO.file;

import java.io.File;

public class Example3 {
    public static void recursion(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File file1 : files) {
                    if (file1.isDirectory()) {
                        recursion(file1);
                    } else System.out.println(file1.getPath());
                }
            } else {
                System.out.println(file.getPath());
            }
        }
    }
    public static void delete1(File file)
    {
        if(file.isDirectory())
        {
            File[] files=file.listFiles();
            if(files!=null)
            {
                for(File file1: files)
                {
                    if(file1.isDirectory())
                    {
                        delete1(file1);
                    }
                    else
                    {
                        file1.delete();
                    }
                }
                file.delete();
            }
        }
        else
            file.delete();
    }

    public static void main(String[] args) {
//        File folder=new File("D:\\sql");
//        recursion(folder);
        File file=new File("D:\\st");
        delete1(file);
        System.out.println(11);
    }
}
