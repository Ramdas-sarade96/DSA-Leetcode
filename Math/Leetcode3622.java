class Solution
{
    public boolean checkDivisibility(int n)
    {
        int temp = n;
         int sum=0;
         int mult=1;
         while(temp!=0)
         {
            int remind = temp%10;
            sum =sum+remind;
            mult = mult*remind;
            temp = temp/10;
         }

         
         return n%(sum+mult) == 0;
    }
}

public class Leetcode3622 
{
    public static void main(String args[])
    {
         Solution s = new Solution();
         System.out.println(s.checkDivisibility(99));
         
    }
    
}
