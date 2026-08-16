//Game Theorey 

import java.util.*;
class Solution
{
    public boolean stoneGameIX(int stones[])
    {
        int n = stones.length;
        int temp[] = new int[3];
        for(int i=0;i<n;i++)
            {
                temp[stones[i]%3]++;
            } 
            if(temp[0]%2==0)
            {
                return temp[1]>0 && temp[2]>0;
            }
           
            return Math.abs(temp[1]-temp[2])>2;


    }
}

public class Leetcode2029
{
    public static void main(String args[])
    {
        int arr[]=new int[]{5,1,2,4,3};
        Solution s = new Solution();
       boolean ans= s.stoneGameIX(arr);
       System.out.println(ans);


    }
}
