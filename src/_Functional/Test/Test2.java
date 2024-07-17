package _Functional.Test;

public class Test2 {
    public static void main(String[] args) {
        Actor c=Person::dance;
        c.show(new Person());
    }

}
