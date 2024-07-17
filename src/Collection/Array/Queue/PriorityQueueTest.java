package Collection.Array.Queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.offer(5);
        p.offer(3);
        p.offer(2);
        p.offer(4);
        p.offer(0);
        for(Integer c: p)
            System.out.println(c);
        System.out.println("=====");
        while(!p.isEmpty())
        {
            System.out.println(p.poll());
        }
        System.out.println("====");
        User p1=new User("张三",0);
        User p2=new User("李四",2);
        User p3=new User("孙五",3);
        User p4=new User("赵六",2);
        User p5=new User("金华",1);
        PriorityQueue<User> use=new PriorityQueue<>();
        use.offer(p1);
        use.offer(p2);
        use.offer(p3);
        use.offer(p4);
        use.offer(p5);

    }
}
