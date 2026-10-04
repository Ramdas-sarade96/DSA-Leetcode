
 class Solution
{
    int minSumOfLengths(int[] arr, int target) 
    {
              int n = arr.length;
              int firstMin =Integer.MAX_VALUE;
              int secondMin =Integer.MAX_VALUE;
              int firstStart =-1;
              int firstEnd  =-1;
              for(int i=0;i<n;i++)
              {
                 int sum =0;
                  for(int j=i;j<n;j++)
                    { 
                         sum = sum+arr[j];
                         if(sum==target)
                            {
                                   int length = j-i+1;
                                   if(firstStart ==-1)
                                    {
                                           firstMin = length;
                                           firstStart =i;
                                           firstEnd =j;
                                    }       
                                    else if(j<firstStart || i>firstEnd)
                                    {
                                         if(length<secondMin)
                                         {
                                            secondMin = length;
                                         }
                                    }
                            }       
                            else if(sum>target)
                            {
                                break;
                            }
                    }
              }
              if(firstMin>n-1 || secondMin>n-1)
              {
                return -1;
              }
              else
              {
                 return firstMin+secondMin;
              }
    }
}


public class Leetcode1477
{
         public static void main(String args[])
         {
               int arr[] = new int[]{7,3,4,7};
               int target =7;
               Solution s = new Solution();
               System.out.println(s.minSumOfLengths(arr, target));

         }
}
