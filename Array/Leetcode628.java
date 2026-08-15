import java.util.*;

public class Leetcode628
{
    public static void main(String args[])
    {
         int nums[]=new int[]{  -1,-2,1,2,3    };
         int n=nums.length;
         Arrays.sort(nums);

         //case 1:Product of 3 largest number
         int case1 = nums[n-1]*nums[n-2]*nums[n-3];

         //case 2: product of 2 smallest   and 1 largest 
         int case2 = nums[0]*nums[1]*nums[n-1];
         
        int result = Math.max(case1,case2);
         
       System.out.println(result);
    } 
}