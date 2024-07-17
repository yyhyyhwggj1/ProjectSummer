package IO.IO.file._Object;

import java.io.Serializable;

public class People implements Serializable {
    private String name;
    private String sex;
    public People(String name,String sex)
    {
        this.name=name;
        this.sex=sex;
    }

    @Override
    public String toString() {
        return name+"\t"+sex;
    }
}
