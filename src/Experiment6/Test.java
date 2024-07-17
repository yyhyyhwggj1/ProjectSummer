package Experiment6;

public class Test {
    public static void main(String[] args) {
        Student p=new Student(220801,"张三","男","2000年1月1号");
        p.system="科学系";
        p.schoolDate="2006年3月";
        p.print();
        Teacher p1=new Teacher(220101,"李四","男","1988年1月1号");
        p1.duties="校长";
        p1.signTime="2020年3月";
        p1.print();
    }
}
