public class Menu {
    public int ordor;
    public String name;
    public Menu(int ordor,String name)
    {
        this.ordor=ordor;
        this.name=name;
    }
    public void showMenu()
    {
        System.out.println(ordor+"."+name);
    }
}
