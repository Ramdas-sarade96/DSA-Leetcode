import java.util.*;

class Solution
{
    public int firstStableIndex(int[] nums, int k)
    {
           int n = nums.length;
           int max = Integer.MIN_VALUE;
           int stability = -1;

           for(int i=0;i<n;i++)
           {
            
                 int min = Integer.MAX_VALUE;
                max = Math.max(max,nums[i]);
              for(int j=i;j<n;j++)
              {
                  min = Math.min(min,nums[j]);
              }
               stability = max-min;
               if(stability<=k)
               {
                  return i;
               }
              
              
           }
           return -1;
    }

}

public class Leetcode3903 
{
    public static void main(String args[])
    {
          int arr[] = new int[]{ 5,0,1,4};
          int k=3;
          Solution s = new Solution();
          System.out.println(s.firstStableIndex(arr,k));
    } 
    
}

