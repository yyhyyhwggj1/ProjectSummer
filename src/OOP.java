import java.util.Scanner;

public class OOP {
    public static User user=new User();

     public static Scanner sc=new Scanner(System.in);
       public static Menu[] mainMenus =new Menu[]
                {
                        new Menu(1,"学生成绩管理"),
                        new Menu(2,"学生选课管理"),
                        new Menu(3,"退出系统")
                };
       public static Menu[] secondMenus=new Menu[]
               {
                       new Menu(1,"添加成绩"),
                       new Menu(2,"查看成绩"),
                       new Menu(3,"修改成绩"),
                       new Menu(4,"删除成绩"),
                       new Menu(5,"返回主菜单")
               };
       public static void show(Menu[] Menus)
       {
           for(int i=0;i< Menus.length;++i)
           {
               System.out.println(Menus[i].ordor+"."+Menus[i].name);
           }
       }
       public static void gotoMain()
       {
           show(mainMenus);
           System.out.println("请选择：");
           int number=sc.nextInt();
           if(number==1) {
               System.out.println("你选择了学生成绩管理");
           }
           else if(number==2)
               gotoSecond();
           else
               System.out.println("感谢xxx");
       }
       public static void gotoSecond()
       {
           show(secondMenus);
           System.out.println("请选择：");
           int number=sc.nextInt();
           switch(number)
           {
               case 1:user.add();
               gotoSecond();
               break;
               case 2:user.find();
               gotoSecond();
               break;
               case 3:user.modify();
               gotoSecond();
               break;
               case 4:user.delete();
               gotoSecond();
               break;
               case 5:gotoMain();
               break;
           }

       }

    public static void main(String[] args) {
        gotoMain();
    }
}
