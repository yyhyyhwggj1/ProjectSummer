package Polymorphism.Lesson3;

public class ObjectTest {
    public static void main(String[] args) {
        TV tv=new TV();
        Class tvClass=tv.getClass();
        String TVName= tvClass.getName();
        System.out.println(TVName);
        String TVSimplyName= tvClass.getSimpleName();
        System.out.println(TVSimplyName);
        Class superClass=tvClass.getSuperclass();
        String superName=superClass.getName();
        System.out.println(superName);
        String superSimplyName=superClass.getSimpleName();
        System.out.println(superSimplyName);
        String s="admin";
        Class classes=s.getClass();
        Class[] interfacesClasses=classes.getInterfaces();
        for(int i=0;i<interfacesClasses.length;++i)
        {
            Class clazz=interfacesClasses[i];
            String name=clazz.getName();
            String simplyName= clazz.getSimpleName();
            System.out.println(name);
            System.out.println(simplyName);
        }
    }
}
