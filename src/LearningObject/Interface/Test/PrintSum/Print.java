package LearningObject.Interface.Test.PrintSum;

public class Print {
    public Print()
    {
    }
    public Print(Cartridge ink,Paper paper)
    {
        this.ink=ink;
        this.paper=paper;
    }
    private Cartridge ink;
    private Paper paper;
    public String getInk()
    {
        return this.ink.getInk();
    }
    public String getPaper()
    {
        return this.paper.getPaper();
    }
}
