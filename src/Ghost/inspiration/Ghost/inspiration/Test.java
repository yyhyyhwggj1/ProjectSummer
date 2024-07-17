package Ghost.inspiration.Ghost.inspiration;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
   public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        try{
            int a=getNumber();
        }
        catch (InputMismatchException e)
        {
            System.out.println("请不要瞎搞，输入数字！");
            System.out.println(e.getClass().getName());
            e.printStackTrace();
            System.out.println("异常信息："+e.getMessage());
        }
        System.out.println("程序正常运行！");
    }
    public static int getNumber()
    {
        System.out.println("请输入数字：");
        int t=sc.nextInt();
        return t;
    }
}
