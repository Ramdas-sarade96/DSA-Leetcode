

//Brute Force Approch

//Time Complexity = O(3N) ~ O(N)
//Space Complexity = O(2N) ~ O(N)

class Solution
{
       int n;
      
      public int trap(int[] height)
      {
            this.n= height.length;
            int prefixMax[] = new int [n];
            int sufixMax[] = new int[n];
            int total = 0;
            int leftMax=0, rightMax =0;
            prefixMax[0] = height[0];
            sufixMax[n-1] = height[n-1];
            for(int i=1;i<n;i++)
            {
                prefixMax[i] = Integer.max(prefixMax[i-1],height[i]);
            }

          
            for(int i=n-2;i>=0;i--)
            {
                sufixMax[i] = Integer.max(sufixMax[i+1],height[i]);
            }
           
            for(int i=0;i<n;i++)
            {
                 leftMax = prefixMax[i];
                 rightMax = sufixMax[i] ;
                 if(height[i]<leftMax && height[i]<rightMax)
                 {
                    total += Integer.min(leftMax,rightMax)-height[i];
                 }
            }

            return total;
      }
}

public class Leetcode42BruteForce 
{
    public static void main(String args[])
    {
        Solution s = new Solution();
         int arr[] = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        
        System.out.println(s.trap(arr)) ;
         
    }
}
