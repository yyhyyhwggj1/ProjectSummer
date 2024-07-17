package Collection.Array.Iteration;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

public class MyCollection<T> extends AbstractCollection<T> {

    private Object[] elements;
    private  int size;
    public MyCollection(){
        this(16);
    }
    public MyCollection(int capacity)
    {
        elements=new Object[capacity];
    }
    @Override
    public Iterator<T> iterator() {
        return new CollectionIterator();
    }

    @Override
    public int size() {
        return size;
    }
    public boolean add(T o)
    {
        if(size==elements.length)
        {
            int length= elements.length+elements.length>>1;
            Arrays.copyOf(elements,length);
        }
        elements[size++]=o;
        return true;
    }
    class CollectionIterator implements Iterator{

        private int cursor;
        @Override
        public boolean hasNext() {
            return cursor<size ;
        }

        @Override
        public T next() {
            if(cursor>=size||cursor<0)
            {
                throw new ArrayIndexOutOfBoundsException("下标越界了！");
            }
            return (T)elements[cursor++];
        }

        @Override
        public void remove() {
            if(cursor<0||cursor >=size)
            {
                throw  new ArrayIndexOutOfBoundsException("下标越界了！");
            }
            System.arraycopy(elements,cursor,elements,cursor-1,size-cursor);
            if(cursor==size)
                cursor--;
            size--;
        }
    }
}
