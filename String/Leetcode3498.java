
class Solution
{
     int reverseDegree(String s)
     {
            int n = s.length();
            int ans =0;
            for(int i=0;i<n;i++)
            {
                char ch = s.charAt(i);
                int temp = 'z'-ch+1;
                int multi = temp*(i+1);
                ans = ans+multi;
                
            }
            return ans;
          
     }
}
public class Leetcode3498 
{
       public static void main(String args[])
       {
          Solution s = new Solution();
          String str = "zaza";
         System.out.println(s.reverseDegree(str));
       }
    
}
