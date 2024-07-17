package RefrenceMethod.LamadaDelay;

public class PrintUtil {
    public static String build(String...infos)
    {
        StringBuilder builder=new StringBuilder();
        for(String info:infos)
        {
            builder.append(info);
        }
        return builder.toString();
    }
    public static void print(boolean valid,String...infos)
    {
        if(valid)
        {
//
//            BuildMsg buildMsg=new BuildMsg() {
//                @Override
//                public String msgBuild(String... infos) {
//                    return PrintUtil.build(infos);
//                }
//            };
//
            BuildMsg buildMsg=PrintUtil::build;
            System.out.println(buildMsg.msgBuild(infos));
        }
    }
}
