package _Functional.Test;

public class Test1 {
    public static void main(String[] args) {
        Printer c=new Printer();
        Print p=c::printer;
        p.print("来了！");
    }
}
