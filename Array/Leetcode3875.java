
class Solution
{
     public boolean uniformArray(int[] nums1)
     {
          int n= nums1.length;
          int j=0;
          int nums2[] = new int[n];
          int min  = Integer.MAX_VALUE;
          int k=0;
          for(int i=0;i<n;i++)
          {
             if(nums1[i]%2==0)
             {
                nums2[i] = nums1[i] ;
                k++;
             }
          }

          if(k==n)
          {
            return true;
          }
    
          for(int i=0;i<n;i++)
          {
                if(nums1[i]%2!=0)
                {
                   if(min>nums1[i])
                   {
                       min  = nums1[i]; 
                       j=i;
                   }

                }
          }

          for(int i=0;i<n;i++)
          {
               if(nums1[i]%2==0)
               {
                   int temp =  nums1[i] - nums1[j];
                   if(temp<1)
                   {
                      return false;
                   }
               }
               else
               {
                  nums2[i] = nums1[i];
               }
          }

          return true;
     }
}

public class Leetcode3875 
{
    public static void main(String args[])
    {
         int arr[] = new int[]{1,4,7};
         Solution s = new Solution();
         System.out.println(s.uniformArray(arr));
    }
    
}
