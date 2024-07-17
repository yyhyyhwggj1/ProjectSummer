package RefrenceMethod.StaticMethod;

import RefrenceMethod.StaticMethod.Calculate;
import RefrenceMethod.StaticMethod.MathUtil;

public class Test {
    public static void main(String[] args) {
        Calculate calculate= MathUtil::minus;
        int result=calculate.calculator(1,10);
        System.out.println(result);
    }
}
