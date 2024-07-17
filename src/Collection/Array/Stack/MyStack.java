package Collection.Array.Stack;

import java.util.ArrayList;

public class MyStack<T> extends ArrayList<T> {
    public void push(T t)
    {
        add(t);
    }
    public T pop()
    {
        if(size()==0) throw new IllegalArgumentException("栈里没有数据了");
        T t=get(size()-1);
        remove(t);
        return t;
    }
}
