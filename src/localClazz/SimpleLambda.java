package localClazz;

public class SimpleLambda {
    public static void main(String[] args) {
        PrintTime p=new PrintTime() {
            @Override
            public void print() {
                System.out.println(System.currentTimeMillis());
            }
        };
        p.print();
        PrintTime p1=()->{
            System.out.println(System.currentTimeMillis());
        };
        p1.print();
        PrintTime p2=()-> System.out.println(System.currentTimeMillis());
        p2.print();
    }
}
