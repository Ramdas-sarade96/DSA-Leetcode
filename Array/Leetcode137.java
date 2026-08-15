import java.util.*;

public class Leetcode137 
{
    public static void main(String args[])
    {
        int nums[]=new int[]{0,1,0,1,0,1,99};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
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
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==1)
            {
                ans=nums[i];
                
            }
        }
        System.out.println(ans);
    }
    
}
