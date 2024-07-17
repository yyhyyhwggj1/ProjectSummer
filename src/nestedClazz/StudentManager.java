package nestedClazz;

import java.util.Arrays;

public class StudentManager {
    Student[] stus={};
    public void addStudent(Student stu)
    {
        stus= Arrays.copyOf(stus,stus.length+1);
        stus[stus.length-1]=stu;
    }
    public void show(studentSorter sorter)
    {
        sorter.sort(stus);
        for(Student stu: stus)
            System.out.println(stu);
    }
    static class studentSorter{
        private int order;
        public studentSorter(int order)
        {
            this.order=order;
        }
        public studentSorter()
        {
            this(0);
        }
        public void sort(Student[] stus)
        {
            for(int i=0;i< stus.length-1;++i)
            {
                for(int j=0;j< stus.length-i-1;++j)
                {
                    if(order==1&&(stus[j].getAge()<stus[j+1].getAge())||order==0&&stus[j].getAge()>stus[j+1].getAge())
                    {
                        Student temp=stus[j];
                        stus[j]=stus[j+1];
                        stus[j+1]=temp;
                    }
                }
            }
        }
    }
}
