package Collection.Array.Queue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkBlockingQueueTest {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue=new LinkedBlockingQueue<>(5);
        String first=queue.peek();
        System.out.println(first);
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        boolean is=queue.offer("f");
        System.out.println(is);
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        String  is1=queue.poll();
        System.out.println(is1);
    }
}
