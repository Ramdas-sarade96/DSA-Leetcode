import java.util.*;
public class MaxDepth 
{
    public static void main(String args[])
    {
        String s="(1)+((2))+(((3)))";
        int n=s.length();
        char count[]=s.toCharArray();
        int max=0;
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            if(count[i]=='(')
            {
                max++;
                if(max>=maxi)
                {
                    maxi=max;
                }
            }
            if(count[i]==')')
            {
                max--;
            }

        }
        System.out.println(maxi);

    }
    
}
