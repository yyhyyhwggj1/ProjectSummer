package Collection.Array.LinkList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> first=new LinkedList<>();
        first.add("第一个链");
        first.add("第二个链");
        first.addFirst("第三个链");
        first.addLast("第四个链");
        String fir=first.removeFirst();
        String sec=first.removeLast();
        System.out.println(fir);
        System.out.println(sec);
        fir=first.getFirst();
        sec=first.getLast();
        System.out.println(fir);
        System.out.println(sec);
        System.out.println(first);
    }
}
