import java.util.*;
public class Leetcode1299 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{400};
        int n=arr.length;
        int ans[]=new int [n];
        for(int i=0;i<n;i++)
        {
                    int max=Integer.MIN_VALUE;

            for(int j=i+1;j<n;j++)
            {
                   max=Math.max(max,arr[j]);
            }
            if(i==n-1)
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=max;
            }
        }

        for(int i=0;i<n;i++)
        {
               System.out.println(ans[i]);
        }
    }
    
}
