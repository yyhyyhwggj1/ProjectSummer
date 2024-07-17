package RefrenceMethod.MemberMethod;

public class ActorTest {
    public static void main(String[] args) {
        Actor actor=Person::dance;
        actor.perform(new Person());
        Actor actor1=Person::sing;
        actor1.perform(new Person());
    }
}
