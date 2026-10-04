
class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
         int low = 0, high = numbers.length-1;
         int arr[] = new int[]{-1,-1};
         while(low<high)
         {
             if(numbers[low] + numbers[high] == target)
             {
                arr[0] = low+1;
                arr[1] = high+1;
                return arr;
                // return new int[]{low+1,high+1};
             }
             else if (numbers[low] + numbers[high] > target)
             {
                high--;
             }
             else
             {
                low++;
             }
         }

        // return new int[]{-1,-1};
        return arr;
    }
}


public class Leetcode167
 {
    public static void main(String args[])
    {
        int arr[] = new int[]{2,7,11,15};
        int target = 9;
          Solution s = new Solution();
         
          int arr2[] = s.twoSum(arr, target);
          for(int i=0;i<arr2.length;i++)
          {
                System.out.println(arr2[i]);
          }

    }
    
}
