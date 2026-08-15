public class JumpGameII 
{
    int Jump(int nums[],int n)
    {
        int jump=0;
        int end=0;
        int farthest=0;
       for(int i=0;i<n-1;i++)
       {
           farthest=Math.max(farthest,i+nums[i]);
           if(i==end)
           {
            jump++;
           end= farthest;
           }
       }
       return jump;
    }
    
    public static void main(String args[])
    {
        int nums[]=new int[]{2,3,1,1,4};
        int n=nums.length;
        JumpGameII j1=new JumpGameII();
        System.out.println(j1.Jump(nums,n));



    }
    
}
