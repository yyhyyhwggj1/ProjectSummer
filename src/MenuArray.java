public class MenuArray {
    public static void main(String[] args) {
        Menu[] mainMenus={
                new Menu(1,"学生成绩管理"),
                new Menu(2,"学生选课管理"),
                new Menu(3,"返回主菜单")
        };
        Menu[] secondMenus={
                new Menu(1,"增加成绩"),
                new Menu(2,"查找成绩"),
                new Menu(3,"修改成绩"),
                new Menu(4,"删除成绩"),
                new Menu(5,"返回主菜单")
        };
        show(mainMenus);
        show(secondMenus);
    }
    public static void show(Menu[] menus)
    {
        for(int i=0;i< menus.length;++i)
        {
            menus[i].showMenu();
        }
    }
}
