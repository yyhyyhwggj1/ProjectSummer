import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

        public static void main(String[] args) {
            List<Integer> list=new ArrayList<>();

            for(int i=0;i<2;++i)
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("请随即输入数字：");
                Integer num=sc.nextInt();
                list.add(num);
            }
            Integer[] num=list.toArray(new Integer[2]);
            int t=0;
            for(int i=0;i<num.length-1;i++)
            {
                for(int j=0;j<num.length-i-1;j++)
                {
                    if(num[j]<num[j+1])
                    {
                        t=num[j];
                        num[j]=num[j+1];
                        num[j+1]=t;
                    }
                }
            }
            for(Integer in:num)
            {
                System.out.println(in+" ");
            }

        }
    }
