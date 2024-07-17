package RefrenceMethod.MemberMethod;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer=new Computer(new Printer());
        computer.print("This is print!");
    }
}
