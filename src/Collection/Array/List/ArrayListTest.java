package Collection.Array.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        for(String l:list)
        {
            System.out.println(l);
        }
        System.out.println("=======");
        list.add(2,"c");
        for(ListIterator<String> listIterator= list.listIterator();listIterator.hasNext();)
        {
            String s=listIterator.next();
            System.out.println(s);
        }
        System.out.println("======");
        list.set(1,"g");
        Iterator<String> ite= list.iterator();
        while(ite.hasNext())
            System.out.println(ite.next());
        System.out.println("====");
        ListIterator<String> preIte=list.listIterator(list.size());
        while(preIte.hasPrevious())
        {
            String s1= preIte.previous();;
            System.out.println(s1);
        }
        System.out.println("=====");
        for(int i=0;i<list.size();++i)
        {
            System.out.println(list.get(i));
        }
        System.out.println("===");
        List<String> subList=list.subList(2,4);
        for(String s:subList)
            System.out.println(s);
        System.out.println("========");
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for(Integer a:numbers)
            System.out.println(a);
        System.out.println("====");
        numbers.remove((Integer) 3);
        numbers.remove(3);
        for(Integer n:numbers)
            System.out.println(n);
        System.out.println("=====");
        numbers.add(2);
        numbers.add(2);
        int index1= numbers.indexOf(2);
        int index2=numbers.lastIndexOf(2);
        System.out.println(index1);
        System.out.println(index2);

    }
}
