import java.util.*;
public class Leetcode1365 
{
    public static void main(String args[])
    {
        int nums[]=new int[]{ 1};
        int n=nums.length;
        int result[]=new int[n];
        int temp=0;
       
        for(int i=0;i<n;i++)
        {
            temp=0;
            for(int j=0;j<n;j++ )
            {
                if(nums[j]<nums[i] && i!=j)
                {
                    temp++;
                }
            }
            result[i]=temp;
        }

        for(int i=0;i<n;i++ )
        {
            System.out.println(result[i]);
        }
    }
    
}
