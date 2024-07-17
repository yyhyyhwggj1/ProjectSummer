package Collection.Array.LinkList;

public class DeNode<T> {
    private T data;
    private DeNode<T> prev;
    private DeNode<T> next;
    public DeNode(T data,DeNode<T> prev,DeNode<T> next)
    {
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    public T getData() {
        return data;
    }

    public DeNode<T> getNext() {
        return next;
    }

    public DeNode<T> getPrev() {
        return prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(DeNode<T> next) {
        this.next = next;
    }

    public void setPrev(DeNode<T> prev) {
        this.prev = prev;
    }
}
