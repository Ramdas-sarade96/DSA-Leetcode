

// there is one important pattern using index make negative then it use pattern and give perfect ans  

import java.util.HashMap;
import java.util.*;

public class Leetcode645 
{
    public static void main(String args[])
    {
        int nums[]= new int[]{ 2,2,3,4};
        int n=nums.length;
        int result[]=new int[2];

        
        for(int i=0;i<n;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
            {
                result[0]=Math.abs(nums[i]);
            }
            else
            {
                nums[index]=-nums[index];
            }
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                result[1]=i+1;
            }
        }

        for(int i=0;i<2;i++)
        {
            System.out.println(result[i]);
        }
        

    }
    
}
