package exercise;

public class Exercise1 {
    public static void main(String[] args) {
        String s="abababababa";
        int len=s.length();
        String target="aba";
        int targetLen=target.length();
        int max=len-targetLen;
        int times=0;
        for(int i=0;i<=max;i++)
        {
            String s1=s.substring(i,i+targetLen);
            if(s1.equals(target));
            times++;
        }
        System.out.println(times);

    }
}
