package Collection.Array;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayUtil p=new ArrayUtil();
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);
        for(Object a: p.array)
        {
            System.out.println(a);
        }
        p.update(2,6);
        for(Object a: p.array)
        {
            System.out.println(a);
        }
        p.delete(2);
        for(Object a: p.array)
        {
            System.out.println(a);
        }
        Object e=p.get(3);
        System.out.println(e);
    }
}
