package Ghost.inspiration.Ghost.inspiration;

public class Experiment {
    public void show(Rush o)
    {
        if(o instanceof StaticThings)
        {
            o=((StaticThings)o);
            o.rush();
        }
        else if(o instanceof RunningThings)
        {
            o=((RunningThings)o);
            o.rush();
        }
    }
}
