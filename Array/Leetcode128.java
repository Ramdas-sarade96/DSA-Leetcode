import java.util.*;
public class Leetcode128
{
    public static void main(String args[])
    {
        int arr[]=new int[]{0,3,7,2,5,8,4,6,0,1};
        int n=arr.length;
        Arrays.sort(arr);
        //int ans=0;
       
        int ans=1,count=1;
        
        for(int i=0;i<n-1;i++)
        {
           if(arr[i+1]==arr[i]+1)
           {
              count++;
              ans=Math.max(ans,count);
           }
           else if(arr[i]==arr[i+1])
           {
            continue;
           }
           else
           {
             // ans=0;
             count=1;
           }
           
          
        }
        System.out.println(ans);
    }
}