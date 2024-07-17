package Collection.Array.Iteration;

import java.util.Iterator;

public class MyCollectionTest {
    public static void main(String[] args) {
//        MyCollection p=new MyCollection();
//        p.add("a");
//        p.add("b");
//        p.add("c");
//        p.add("d");
//        p.add("e");
//        Iterator iterator=p.iterator();
//        System.out.println(p.size());
//        while(iterator.hasNext())
//        {
//            String s=(String)iterator.next();
//            System.out.println(s);
//        }
//        p.remove("c");
//        for(Object o:p)
//            System.out.println(o);
//        boolean exist=p.contains("c");
//        System.out.println(exist);
//        MyCollection p1=new MyCollection();
//        p1.add(1);
//        p1.add(2);
//        p1.add(3);
//        p1.add(4);
//        p1.add(5);
//        for(  Iterator iterator1=p1.iterator();iterator1.hasNext();)
//            System.out.println(iterator1.next());
//        System.out.println(p1.size());
//        MyCollection p2=new MyCollection();
//        p2.add("a");
//        p2.add(1);
//        p2.add(1.0f);
//        p2.add('a');
//        for(  Iterator iterator2=p2.iterator();iterator2.hasNext();)
//        {
//            Integer i=(Integer) iterator2.next();
//            System.out.println(i);
//        }
         MyCollection<String> collection=new MyCollection();
         collection.add("a");
         collection.add("b");
         collection.add("c");
         collection.add("d");
         collection.add("e");
         for(Iterator<String> iterator=collection.iterator();iterator.hasNext();)
         {
             String s=iterator.next();
             System.out.println(s);
         }
         MyCollection<String> collection1=new MyCollection<>();
         collection1.add("a");
         collection1.add("b");
         collection1.add("c");
         boolean contain=collection.containsAll(collection1);
        System.out.println(contain);
        MyCollection<?extends Integer> p=new MyCollection<>();

        MyCollection<?super String> p1=new MyCollection<>();
        p1.add("a");
    }

}
