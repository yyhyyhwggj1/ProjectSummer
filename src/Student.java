public class Student {
    public String name;
    public int age;
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return name+"\t"+age;
    }

    @Override
    protected void finalize() throws Throwable {
        this.name=null;
        System.out.println("所有资源释放完毕，可以开始清理了");
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        Student other=(Student)obj;
        return this.name.equals(other.name)&&this.age==other.age;
    }
}
