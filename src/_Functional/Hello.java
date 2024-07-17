package _Functional;
@FunctionalInterface
public interface Hello {
    void sayHello(String name);
    default void Happy(){};
    default void Sad(){}
    static void print(){}
}
