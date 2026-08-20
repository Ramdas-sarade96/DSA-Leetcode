class Solution
{
     int [] resultnumsay(int nums[])
     {
           int n= nums.length;
           int arr1[]  = new int[n];
           int arr2[] = new int[n];
           int j=0;
           int k=0;
           arr1[j] = nums[0];
           arr2[k]=nums[1];
           for(int i=2;i<n;i++)
           {
             if(arr1[j]>arr2[k])
             {
                arr1[++j] = nums[i];
             }
             else
             {
                arr2[++k] =nums[i];
             }
           }
           
           int result[] = new int[j+k+2];
           for(int i=0;i<=j;i++ )
           { 
               System.out.println(arr1[i]);
               result[i] = arr1[i];
           }
            System.out.println("\n\n\n");
           
           for(int i=0;i<=k;i++)
           {
              System.out.println(arr2[i]) ;           
              result[j+1]=arr2[i];
           }
           
           System.out.println("\n\n\n");
           return result;

     }
}


public class Leetcode3069
 {

     public static void main(String args[])
     {
        int nums[] = new int[]{ 5,4,3,8};
        Solution s = new Solution();
        int ans []=s.resultnumsay(nums);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
     }
}
