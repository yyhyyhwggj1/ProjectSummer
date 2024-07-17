package Collection.Array.Map;

public class MyEntry<K,V> {
    private K k;
    private V v;
    private MyEntry<K, V> next;

    public MyEntry(K k, V v, MyEntry<K, V> next) {
        this.k = k;
        this.v = v;
        this.next = next;
    }

    public K getK() {
        return k;
    }

    public MyEntry<K, V> getNext() {
        return next;
    }

    public V getV() {
        return v;
    }

    public void setNext(MyEntry<K, V> next) {
        this.next = next;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
        this.v = v;
    }
}
