package localClazz;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
//        RandomField p= new RandomField() {
//            @Override
//            public int random(int stat, int end) {
//                return (int)Math.random()*(end-stat)+stat;
//            }
//        };
//        int resul=p.random(10,20);
//        System.out.println(resul);
//        Random random=new Random;
//        int result=random.nextInt(10);
//        RandomField p=(int start,int end)->{
//            return new Random().nextInt(end-start)+start;
//        };
        RandomField p=(start,end)->new Random().nextInt(end-start)+start;
        System.out.println(p.random(10,20));
    }
}
