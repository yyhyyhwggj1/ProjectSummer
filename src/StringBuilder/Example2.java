package StringBuilder;

public class Example2 {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer(1024);
        buffer.append("abcdef");
        buffer.delete(2,3);
        buffer.deleteCharAt(0);
        System.out.println(buffer);
    }
}
