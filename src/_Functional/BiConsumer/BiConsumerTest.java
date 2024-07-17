package _Functional.BiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
//        BiConsumer<String,String> biConsumer=new BiConsumer<String, String>() {
//            @Override
//            public void accept(String s, String s2) {
//                System.out.println(s+"=>+s2");
//            }
//        };
        BiConsumer<String,String> biConsumer=(s,s2)->System.out.println(s+"=>+s2");
        biConsumer.accept("CN","中国");
        biConsumer.accept("EN","英国");
        biConsumer.accept("US","美国");

        Map<String,String> prices=new HashMap<>();
        prices.put("CS","长沙");
        prices.put("BJ","北京");
        prices.put("SC","四川");
        prices.forEach((s1,s2)-> System.out.println(s1+"=>"+s2));
    }
}
