package Collection.Array.Stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        MyStack<Integer> p=new MyStack<>();
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        p.push(6);
        while(!p.isEmpty())
        {
            System.out.println(p.pop());
        }
        Stack<String> p1=new Stack<>();
    }
}
