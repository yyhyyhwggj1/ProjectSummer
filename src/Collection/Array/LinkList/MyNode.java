package Collection.Array.LinkList;

public class MyNode <T>{
    private T data;
    private MyNode<T>  next;
    public MyNode (T data,MyNode<T> next)
    {
        this.data=data;
        this.next=next;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
