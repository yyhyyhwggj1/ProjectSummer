package IO.IO.file;

import java.io.File;
import java.io.FileFilter;

public class Example2 {
    public static void main(String[] args) {
        File file=new File("D:\\Java class\\IntelliJ IDEA 2023.3.6\\bin");
        File[] files=file.listFiles();

        FileFilter filter=new FileFilter() {
            @Override
            public boolean accept(File file) {
                String name=file.getName();
                return name.endsWith(".exe");
            }
        };
        File[] filter2=file.listFiles(filter);
        if(filter2!=null)
        {
            for(File file2: filter2)
            {
                System.out.println(file2);
            }
        }
    }
}
