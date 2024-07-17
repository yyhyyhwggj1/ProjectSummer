package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        double n=sc.nextDouble();
        StringBuffer buffer=new StringBuffer();
        buffer.append(n);
        int index= buffer.indexOf(".");
        if(index<=3)
            System.out.println(buffer);
        else
        {
            for (int i = index - 3; i > 0; i -= 3)
            {
                buffer.insert(i,",");
            }
        }
        System.out.println(buffer);
    }
}
