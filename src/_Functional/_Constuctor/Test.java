package _Functional._Constuctor;

public class Test {
    public static void main(String[] args) {
        PersonBuilder p=Person::new;
        Person person=p.build("张三","男");
        System.out.println(person);
    }
}
