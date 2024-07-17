package IO.IO.file.buffer;

import java.io.*;

public class Example1 {
    public static void readLine()
    {
        File folder=new File("");
        try(Reader reader=new FileReader(folder);
         BufferedReader br=new BufferedReader(reader)) {
            while(true)
            {
                String line=br.readLine();
                if(line==null)break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeLine() {
        File file=new File("D:\\bb\\cc\\tes.txt");
        File parent=file.getParentFile();
        if(!parent.exists())parent.mkdirs();
       try(Writer writer=new FileWriter(file);
       BufferedWriter bw=new BufferedWriter(writer)) {
           bw.write("这是第一行！");
           bw.newLine();
           bw.write("这是第二行！");
           bw.newLine();
           bw.write("这是第三行！");
           bw.newLine();
           bw.write("这是第四行！");
           bw.newLine();
           bw.flush();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
    public static void copyFile(String sourceFile,String destFile)
    {
        File file=new File(destFile);
        File parent=file.getParentFile();
        if(!parent.exists())parent.mkdirs();
        try(Reader reader=new FileReader(sourceFile);
         BufferedReader br=new BufferedReader(reader);
          Writer writer=new FileWriter(destFile);
          BufferedWriter bw=new BufferedWriter(writer)) {
            while(true)
            {
                String line=br.readLine();
                if(line==null)break;
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String sourceFile="D:\\bb\\cc\\tes.txt";
        String destFile="D:\\aa\\b\\test.txt";
        copyFile(sourceFile,destFile);
    }
}
