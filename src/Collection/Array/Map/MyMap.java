package Collection.Array.Map;

public class MyMap<K,V> {
    MyEntry<K,V>[] elements;
    private float loadFactor=0.75f;
    private int size;
    public MyMap(int capacity)
    {
        elements=new MyEntry[capacity];
    }
    public MyMap()
    {
        this(16);
    }
    public V put(K key,V value)
    {
        int currentSize=size+1;
        if(currentSize>=elements.length*loadFactor)
        {
            MyEntry<K,V> [] entries=new MyEntry[currentSize<<1];
            for(MyEntry<K,V> entry:entries)
            {
                int hash=entry.getK().hashCode();
                int index=hash&(entries.length-1);
                entries[index]=entry;
            }
            elements=entries;
        }
        int hash=key.hashCode();
        int index=hash&(elements.length-1);
        MyEntry<K,V> add=new MyEntry<>(key,value,null);
        if(elements[index]==null)
            elements[index]=add;
        else
        {
            MyEntry<K,V> exist=elements[index];
            while(exist.getNext()!=null)
            {
                exist=exist.getNext();
            }
            exist.setNext(add);
        }
        size++;
        return elements[index].getV();
    }
    public V get(K key)
    {
        for(MyEntry<K,V> en:elements)
        {
            if(en==null)
                continue;
            if(key.equals(en.getK()))
                return en.getV();
            MyEntry<K,V> temp=en.getNext();
            while(temp!=null)
            {
                if(temp.getK().equals(key))return temp.getV();
                temp=temp.getNext();
            }
        }
        return null;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }

}
