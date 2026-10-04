
class Solution
{
     public int minimumDeletions(int[] nums) 
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex =0, maxIndex =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min = nums[i];
                 minIndex = i;
            }
            if(nums[i]>max)
            {
                max = nums[i];
                 maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int start = right+1;
        int end = nums.length - left;
        int both = left+1+nums.length-right;

        int ans = Integer.min(start,end);
        return Math.min(ans,both);
        

        
    }

}


public class Leetcode2091 
{
    public static void main(String args[])
    {
          Solution s = new Solution();
          int arr[] = new int[]{2,10,7,5,4,1,8,6};
          s.minimumDeletions(arr);
    }
    
}
