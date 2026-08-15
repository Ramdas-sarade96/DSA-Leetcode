public class Minimum {
    
    public static void main(String args[])
    {
        int start=3;
        int goal=4;
        int ans=start^goal;
        int cnt=0;
       for(int i=0;i<32;i++)
       {
        if((ans&(1<<i))!=0)
        {
            cnt++;
        }
       }
       System.out.println(cnt);
    }
}
    
