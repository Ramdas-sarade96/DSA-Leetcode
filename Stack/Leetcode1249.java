import java.util.*;

class Solution
{
     public String minRemoveToMakeValid(String s)
     {
          int n = s.length();
          Stack<Character> st = new Stack<>();
          int count =0;
          
          int closeBracket = 0;  
         
          for(int i=0;i<n;i++)
          {
              char ch = s.charAt(i);
        
                if(ch==')')
               {
                closeBracket++;
               }
          }

          for(int i=0;i<n;i++)
          {
             char ch = s.charAt(i);
             
             if(ch =='(')
             {
                if(closeBracket>0)
                {
                     st.push(ch);
                    count++;
                }
             }
             else if(ch==')')
             {
                 closeBracket--;
                if(count>0)
                {
                     st.push(ch);
                     count--;
                }
               
               
                
             
                
             }
             else 
             {
                st.push(ch);
             }
          }
          String ans ="";
          for(Character i:st)
          {
             ans=ans+i;
          }

          return ans;
}
}


public class Leetcode1249 
{
    public static void main(String args[])
    {
         Solution s = new Solution();
         String str = "((abc)";
        System.out.println( s.minRemoveToMakeValid(str));
    }
}

