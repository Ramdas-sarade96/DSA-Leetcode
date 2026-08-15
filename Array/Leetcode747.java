import java.util.Arrays;
import java.util.*;

public class Leetcode747 
{
    public static void main(String args[])
    {
        int nums[]=new int[]{ 3,6,1,0 };
        int n=nums.length;
       int max=Integer.MIN_VALUE;
        int temp = nums[n-1];
        int index=-1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                index=i;
            }

        }

        for(int i=0;i<n;i++)
        {
            if(i!=index && 2*nums[i]>max)
            {
                System.out.println(-1);
            }
        }

        System.out.println(index);
    }
    
}
