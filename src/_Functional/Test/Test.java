package _Functional.Test;

public class Test {
    public static void main(String[] args) {
        Calculate c=Util::minus;
        int result=c.calculator(1,10);
        System.out.println(result);
    }
}
