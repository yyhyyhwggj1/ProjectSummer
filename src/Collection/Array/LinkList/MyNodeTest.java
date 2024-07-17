package Collection.Array.LinkList;

public class MyNodeTest {
    public static void main(String[] args) {
        MyNode<String> first=new MyNode<>("第一个链",null);
        MyNode<String> second=new MyNode<>("第二个链",null);
        first.setNext(second);
        MyNode<String> third=new MyNode<>("第三个链",null);
        second.setNext(third);
        MyNode<String> fourth=new MyNode<>("第四个链",null);
        third.setNext(fourth);
        MyNode<String> head=first;
        while(head!=null)
        {
            System.out.println(head.getData());
            head=head.getNext();
        }
        System.out.println("=====");
        MyNode<Integer> number4=new MyNode<>(4,null);
        MyNode<Integer> number3=new MyNode<>(3,null);
        number3.setNext(number4);
        MyNode<Integer> number2=new MyNode<>(2,null);
        number2.setNext(number3);
        MyNode<Integer> number1=new MyNode<>(1,null);
        number1.setNext(number2);
        MyNode<Integer> Next=number1;
        while(Next!=null)
        {
            System.out.println(Next.getData());
            Next=Next.getNext();
        }
        System.out.println("========");
    }
}
