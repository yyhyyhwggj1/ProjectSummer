package StringBuilder;

public class Example3 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("admin");
        s.reverse();
        System.out.println(s);
        StringBuffer buffer=new StringBuffer("ababababe");
        System.out.println(buffer);
        int index1=buffer.indexOf("ab");
        int index2=buffer.lastIndexOf("ab");
        int len=buffer.length();
        System.out.println(len);
        System.out.println(index1);
        System.out.println(index2);
    }
}
