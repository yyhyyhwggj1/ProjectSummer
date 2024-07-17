package nestedClazz;

public class Student {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
   public Student(String name,int age)
   {
       this.name=name;
       this.age=age;
   }
//    static class Sorter{
//        private int order;
//        public Sorter(int order)
//        {
//            this.order=order;
//        }
//        public void sort(Student[] stus)
//        {
//            for(int i=0;i< stus.length-1;++i)
//            {
//                for(int j=0;j< stus.length-i-1;++j)
//                {
//                    if(order==1&&(stus[j].age<stus[j+1].age)||order==0&&stus[j].age>stus[j+1].age)
//                    {
//                        Student temp=stus[j];
//                        stus[j]=stus[j+1];
//                        stus[j+1]=temp;
//                    }
//                }
//            }
//        }
//    }

    @Override
    public String toString() {
        return "{"+name+":"+age+"}";
    }
}
