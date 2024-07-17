package localClazz;

public class Local {
    public static void main(String[] args) {
        int a=10,b=20;
        int c=calculate(a,b);
        System.out.println(c);
        Animal tiger=new Animal() {
            @Override
            public void show() {
                System.out.println("老虎在吃肉");
            }
        };
        tiger.show();
        Student p=new Student(20,"张三"){
            @Override
            public void show() {
                System.out.println(getAge());
            }
        };
        p.show();
//        Print s=(Object o)->{
//            System.out.println(o);
//        };
//        s.print(new String("这是一段代码"));
        Print s=o-> System.out.println(o);
        s.print("这是一段代码");

    }
    public static int calculate(int a,int b)
    {
//        Calculate p=new Calculate() {
//            @Override
//            public int calculation(int a, int b) {
//                return a+b;
//            }
//        };
//        Calculate p=(s,e)->{
//            return s+e;
//        };
        Calculate p=(s,e)->s+e;
        return p.calculation(a,b);
    }

}
