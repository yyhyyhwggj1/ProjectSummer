package Collection.Array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> p=new ArrayList<>();
        for(int i=0;i<2;++i)
        {
            System.out.println("请入姓名：");
            String name=sc.next();
            System.out.println("请输入性别");
            String sex=sc.next();
            System.out.println("请输入年龄：");
            int age=sc.nextInt();
            System.out.println("请输入分数：");
            double score=sc.nextDouble();
            Student stu=new Student(name,sex,age,score);
            p.add(stu);
        }
        transform(p,"d:\\aaa\\bbb\\c.txt");
        List<Student> s=readFile("d:\\aaa\\bbb\\c.txt");
        for(Student sc1:s)
            System.out.println(sc1);

    }
    public static void transform(ArrayList<Student> students,String path)
    {
        File file=new File(path);
        File parent=file.getParentFile();
        if(!parent.exists())parent.mkdirs();
        try(Writer writer=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(writer)) {
            for(Student stu:students)
            {
                bw.write(stu.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static List<Student> readFile(String path)
    {
        File file=new File(path);
        ArrayList<Student> p1=new ArrayList<>();
        try(Reader reader=new FileReader(file);
            BufferedReader br=new BufferedReader(reader)) {
            String line;
            while((line=br.readLine())!=null)
            {
                String[] arr=line.split(",");
                String name=arr[0];
                String sex=arr[1];
                int age=Integer.parseInt(arr[2]);
                double score=Double.parseDouble(arr[3]);
                p1.add(new Student(name,sex,age,score));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return p1;
    }

    }
