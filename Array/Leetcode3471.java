
import java.util.*;
class Solution
{
    public int largestInteger(int[] nums, int k)
    {
         int n =nums.length;
         HashMap<Integer,Integer>map = new HashMap<>();
         int ans=-1;
         

         for(int i=0;i<=n-k;i++)
         {
            HashSet<Integer>set = new HashSet<>();
            for(int j=i;j<i+k;j++)
            {
                 set.add(nums[j]);
            }
            for(int key:set)
            {
                if(map.containsKey(key))
                {
                    map.put(key,map.get(key)+1);
                }
                else{
                    map.put(key,1);
                }
            }


         }

         for(int key:map.keySet())
         {
            if(map.get(key)==1)
            {
                   ans =Math.max(ans,key);
            }
         }

         return ans;
       
    }
}

public class Leetcode3471
{
    public static void main(String args[]) 
    {
        int arr [] = new int[]{ 0,0};
        int k =1;
        Solution s = new Solution();
       int ans = s.largestInteger(arr, k);
       System.out.println(ans);

    }
}