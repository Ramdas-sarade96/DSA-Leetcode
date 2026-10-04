/* Next Greater Element 
  Soln: Optimize Solution
  Time Comp = Big O(n)  because of monotonic stack 
  Space Comp = Big O(n)

*/
import java.util.*;
class Solution
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
          HashMap<Integer,Integer> map = new HashMap<>();
          Stack<Integer>st = new Stack<>();

          for(int i=nums2.length-1;i>=0;i--)
          {
             while(!st.isEmpty() && st.peek()<nums2[i])
             {
                st.pop();
             }

             if(st.isEmpty())
             {
                map.put(nums2[i],-1);
             }
             else
             {
                map.put(nums2[i],st.peek());
             }
             st.push(nums2[i]);
          }

          int ans[]= new int[nums1.length];
          for(int i=0;i<nums1.length;i++)
          {
             ans[i] = map.get(nums1[i]);
          }
          return ans;
    }

}


public class Leetcode496 
{
    public static void main(String args[])
    {
        int arr1[] = new int[]{4,1,2};
        int arr2[] = new int[]{1,3,4,2};
        Solution s = new Solution();
       int ans[]= s.nextGreaterElement(arr1,arr2);
       for(int i=0;i<ans.length;i++)
       {
         System.out.println(ans[i]);
       }
    }
    
}
