package Collection.Array;

import java.util.Arrays;

public class ArrayUtil {
    Object[] array;
    private int size;
    public ArrayUtil(int capacity)
    {
        array=new Object[capacity];
    }
    public ArrayUtil()
    {
        this(16);
    }
    public void add(Object o)
    {
        if(size>array.length)
        {
            array= Arrays.copyOf(array,array.length+array.length>>1);
        }
        else {
            array[size++]=o;
        }
    }
    public void delete(Object o)
    {
        if(o==null)
            return;
        int index=-1;
        for(int i=0;i<size;++i) {
            if (o .equals(array[i]))
            {
                index = i;
                break;
            }
        }
        System.arraycopy(array,index+1,array,index,size-index-1);
        size--;
    }
    public void update(int index,Object o)
    {
        if(index<0||index>=size)
        {
            throw new ArrayIndexOutOfBoundsException("下标越界了！");
        }
        else
        {
            array[index]=o;
        }
    }
    public Object get(int index)
    {
        if(index<0||index>=size)
        {
            throw new ArrayIndexOutOfBoundsException("下标越界了！");
        }
        else {
            return array[index];
        }
    }
}
