package _Functional.Consumer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer=System.out::println;
        consumer.accept("This is a new World!");
        Consumer<String> consumer1 =s -> System.out.println(s.charAt(2));
        consumer1.accept("Now let`s go!!!!");
        Consumer<String> c3=consumer.andThen(consumer1);
        c3.accept("先打印再取第三个字符");

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
//
//        numbers.forEach(integer ->System.out.println(integer));
        numbers.forEach(System.out::println);
        Set<String> names=new HashSet<>();
        names.add("admin");
        names.add("test");
        names.add("development");
        names.forEach(System.out::println);
    }
}
