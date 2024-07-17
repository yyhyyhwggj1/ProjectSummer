package RefrenceMethod.MemberMethod;

public class Computer {
    private Printer printer;
    public Computer(Printer printer)
    {
        this.printer=printer;
    }
    public void print(String msg)
    {
        Printable printable=printer::print;
        printable.print(msg);
    }
}
