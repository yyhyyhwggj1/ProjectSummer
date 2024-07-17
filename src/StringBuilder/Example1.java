package StringBuilder;

public class Example1 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder(1024);
        s.append("超用心在线教育");
        System.out.println(s);
        StringBuffer s1=new StringBuffer(1024);
        s1.append("超用心在线教育").append(1).append('a').append(true).append(1.0);
        s.append(s1);
        System.out.println(s1);
        System.out.println(s);
    }
}
