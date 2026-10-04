import java.util.*;


//Time Complexity : Big O(N)
//Space Complexity : Big O(N)
// Topics : HashMap and Array
//We can also solve this problem using HashSet

class Solution
{
    int missingMultiple(int[] nums, int k)
    {
          int result =1;
          int temp=1;
          HashMap<Integer,Integer> map = new HashMap<>();
          for(int i=0;i<nums.length;i++ )
          {
              if(map.containsKey(nums[i]))
              {
                map.put(nums[i],map.get(nums[i])+1);
              }
              else
              {
                map.put(nums[i],1);
              }
          }

          for(int i=0;i<nums.length;i++)
          {
              result =  temp*k;
              if(!map.containsKey(result))
              {
                return result;
              }
              temp++;
          }

          result = temp*k;
          return result;
    }
}
public class Leetcode3718 
{
    public static void main(String args[])
    {
          int arr[] = new int[]{99};
          int k =99;
          Solution s = new Solution();
          System.out.println(s.missingMultiple(arr, k));
    }
    
}
