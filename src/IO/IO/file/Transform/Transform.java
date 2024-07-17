package IO.IO.file.Transform;

import java.io.*;

public class Transform {
    public static void main(String[] args) {
        File file =new File("D:\\aa\\b\\abc.txt");
        File parent =file.getParentFile();
        String[] stu={"这是第一行","这是第二行","这是第三行"};
        if(!parent.exists())parent.mkdirs();
        try(OutputStream p=new FileOutputStream(file);
           OutputStreamWriter writer=new OutputStreamWriter(p);
           BufferedWriter bw=new BufferedWriter(writer)) {
           for(String s: stu)
           {
               bw.write(s);
               bw.newLine();
           }
           bw.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void readLine()
    {
        File folder=new File("D:\\aa\\b\\c.txt");
        try(InputStream p=new FileInputStream(folder);
            InputStreamReader reader=new InputStreamReader(p);
            BufferedReader br=new BufferedReader(reader)){
            while(true)
            {
                String s=br.readLine();
                if(s==null)break;
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
