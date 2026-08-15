public class Leetcode744 
{
    public static void main(String args[])
    {
        char nums[] =new char[] { 'e','e','e','e','n','n' };
        char target='e';
        int n=nums.length;
        int temp[]=new int[26];
        for(int i=0;i<n;i++)
        {
            temp[i]=nums[i]-'a';
        }
       int target1 = target-'a';
        for(int i=0;i<n;i++)
        {
            if(temp[i]>target1)
            {
                System.out.println(nums[i]);
                return;
            }
        }

        System.out.println(nums[0]);
            

    }
    
}
