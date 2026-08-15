import java.util.*;
public class PlusOne 
{
    public static void main(String argsp[])
    {
        int a[]=new int[]{ 1,2,3,4};
        int n=a.length;
        String temp="";
        for(int i=0;i<n;i++)
        {
            String temp2=Integer.toString(a[i]);
            temp=temp+temp2;
        }
       System.out.println(" Array to String print:"+""+temp);
        int ans=Integer.parseInt(temp);
        ans=ans+1;
        System.out.println(" Increase by 1"+""+ans);

         temp=Integer.toString(ans);
        if(n==1)
        {
            char b[]=new char[n+1];
            for(int i=0;i<b.length;i++)
            {
                b[i]=temp.charAt(i);
            }
           int nine[]=new int[b.length];
            for(int i=0;i<b.length;i++)
            {
                nine[i]=b[i]-'0';
            }
        }
         
        else 
         {
            char k[]=new char[n];
                for(int i=0;i<n;i++)
            {
                      k[i]=temp.charAt(i);

            }
            for(int i=0;i<n;i++)
            {
                System.out.println(k[i]);
            }
        
            for(int i=0;i<n;i++)
            {
                 a[i]=k[i]-'0';
            }
         }

         

    }
    
}
