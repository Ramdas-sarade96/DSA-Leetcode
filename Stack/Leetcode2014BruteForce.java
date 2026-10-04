/*
   Brute force approch 
   TIME COMP : BIG O(N)
   SPACE COMP : BIG(1)
   WE CAN OPTIMIZE IT 

*/



import java.util.*;
class Solution
{
    public long subArrayRanges(int[] nums)
    {
           
            long ans =0;
            for(int i=0;i<nums.length;i++) 
            {
                long max = Integer.MIN_VALUE;
             long min = Integer.MAX_VALUE;
                   for(int j=i;j<nums.length;j++)
                   {
                      min =Long.min(min,nums[j]);
                      max = Long.max(max,nums[j]);
                      ans = ans +(max-min);
                   }
            }

            return ans;
    }
}


public class Leetcode2014BruteForce 
{
    public static void main(String args[] )
    {
           int arr[] = new int[]{1,2,3};
           Solution s = new Solution(); 
           System.out.println(s.subArrayRanges(arr));
    }
    
}


