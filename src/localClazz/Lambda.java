package localClazz;

public class Lambda {
    public static void main(String[] args) {
        Actor p=()->{
            System.out.println("演员在表演");
        };
        p.show();
    }
}
