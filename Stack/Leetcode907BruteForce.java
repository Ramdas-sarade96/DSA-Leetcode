
/*Brute Force Approch 
 Time Complexity = Big O(n^2)
 Space Complexity = Big O(1)

 we can optimized it 

*/

class Solution
{
    int sumSubarrayMins(int[] arr)
    {
      int mod = 1_000_000_007;
      int sum =0;
      for(int i=0;i<arr.length;i++)
      {
          int min = arr[i];
          for(int j=i;j<arr.length;j++)
          {
            min = Integer.min(min,arr[j]);
            sum = (sum+min)%mod;
          }
      }

      return sum;
    }

}

public class Leetcode907BruteForce 
{
    public static void main(String args[])
    {
        int arr[] = new int[]{3,1,2,4};
        Solution s = new Solution();
        System.out.println(s.sumSubarrayMins(arr));
        
    }
    
}
