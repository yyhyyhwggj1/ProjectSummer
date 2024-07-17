package LearningObject.Interface.Test.PrintSum;

public class PrintTest {
    public static void main(String[] args) {
        Print p1=new Print(new ColorInk(),new A2Paper());
        System.out.printf("%s墨盒%s纸张",p1.getInk(),p1.getPaper());
    }
}
