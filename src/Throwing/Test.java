package Throwing;

public class Test {
    public static void main(String[] args) {
        int result=getNumber();
        System.out.println(result);
    }
    public static int getNumber()
    {
        int number=10;
        try{
            return number;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return 1;
        }
        finally
        {
            number++;
        }
    }
}
