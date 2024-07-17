import java.util.Scanner;

/**
 * 有三个班，第一个班10人、第二个班8人、第三个班7人，请录入这三个班的成绩和年龄，求这三个般的平均成绩和年龄。
 */
public class SchoolInformation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double[][][] infos=new double[3][][];
        infos[0]=new double[10][2];
        infos[1]=new double[8][2];
        infos[2]=new double[7][2];
        for(int i=0;i< infos.length;i++)
        {
            double totalAge=0;
            double totalScore=0;
            for(int j=0;j<infos[i].length;j++)
            {
                System.out.println("请输入年龄：");
                double age = sc.nextDouble();
                System.out.println("请输入成绩：");
                double score = sc.nextDouble();
                infos[i][j] = new double[]{age, score};
                totalScore+=infos[i][j][1];
                totalAge+=infos[i][j][0];
            }
            System.out.println("第"+i+1+"班的平均成绩为："+totalScore/infos[i].length);
            System.out.println("第"+i+1+"班的平均年龄为："+totalAge/infos[i].length);
        }
    }
}
