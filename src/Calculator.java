import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public int number1;
    public int number2;
    public String operator;
    public static Scanner sc=new Scanner(System.in);
   public static int calculate()throws InputMismatchException,ArithmeticException
   {
       try {
           int s1=getNumber();
           int s2=getNumber();
           return s1/s2;
       }
       catch (InputMismatchException e)
       {
           e.printStackTrace();
           System.out.println("不要瞎搞！");
       }
       catch (ArithmeticException e)
       {
           e.printStackTrace();
           System.out.println("不要瞎搞！");
       }
       return 0;
   }
   public static  int getNumber()throws InputMismatchException
   {
       System.out.println("请输入数字：");
       int t=sc.nextInt();
       return t;
   }

    public static void main(String[] args)
    {
        calculate();
    }
}
