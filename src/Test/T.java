package Test;

public class T {
    public static void main(String[] args) {
        Master[] masters=new Master[2];
        masters[0]=new Master("张三",001,20);
        masters[1]=new Master("李四",002,21);
        for(Master mas:masters)
            System.out.println(mas);
    }
}
